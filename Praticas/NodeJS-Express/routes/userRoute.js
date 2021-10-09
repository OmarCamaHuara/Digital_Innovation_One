const fs = require('fs');
const { join } = require('path');

const filePath = join(__dirname, 'users.json');

const getUsers = () => {
    const data = fs.existsSync(filePath) // verificar si el arquivo existe
        ? fs.readFileSync(filePath) // si todo esta bem - ver tudo listado
        :[]
    try{
        return JSON.parse(data)
    }catch (error) {
        return []
    }
}

const save = (user) => fs.writeFileSync(filePath, JSON.stringify(users, null, '\t'))

const userRoute = (app) => {
    app.route('/users/:id?')
        .get((req, res) => {
            const users = getUsers();

            res.send({ users });
        })

        .post((req, res) => {
            const users = getUsers();

            users.push(req.body);
            saveUser(users);

            res.status(201).send('ok')
        })
        .put((req, res) => {
            const users = getUsers();

            saveUser(users.map(user => {
                if(user.id === req.parms.id){
                    return{
                        ...user,
                        ...req.body
                    }
                }
                return user;
            }));
            
            res.status(200).send("Ok")
        })
        .delete((req, res) => {
            const users = getUsers();

            saveUser(users.filter(user => user.id !== req.parms.id))

            res.status(200).send('ok')
        })
}

module.exports = userRoute;