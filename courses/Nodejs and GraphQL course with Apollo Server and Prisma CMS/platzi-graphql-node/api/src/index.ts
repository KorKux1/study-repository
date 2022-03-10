import { ApolloServer } from 'apollo-server';
import fs from 'fs';
import path from 'path';

const modules = fs.readdirSync(path.join(__dirname, 'modules'))

const schemaFiles = modules.map(module => fs.readFileSync(path.join(__dirname, 'modules', module, "schema.graphql"), 'utf8')).join('\n')

const typeDefs = [fs.readFileSync(path.join(__dirname, "schema.graphql"), 'utf8')]

typeDefs.push(schemaFiles)




// 2 - Resolvers
const resolvers = {
  Query : {
    test: () => { return "Hello World" }
  },
  // avos: () => {return "Hello World"},
  // avo: ({ id }: {id:any}) => {return "Hello World"},
  // createAvo: () => {return "Hello World"}
};

// 3 -  Init Server
const server = new ApolloServer({
  typeDefs,
  resolvers
});

server.listen().then(({ url }) => console.log(`Server is running on ${url}`));
