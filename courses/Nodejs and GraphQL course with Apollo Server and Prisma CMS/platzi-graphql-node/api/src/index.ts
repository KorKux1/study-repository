import { ApolloServer } from 'apollo-server';
import fs from 'fs';
import path from 'path';

const modules = fs.readdirSync(path.join(__dirname, 'modules'))

const typeDefs = 

modules.map(module => fs.readFileSync(path.join(__dirname, 'modules', module, "schema.graphql"), 'utf8')).join('\n')



// 2 - Resolvers
const resolvers = {
  avos: () => {return "Hello World"},
  avo: ({id}) => {return "Hello World"},
  createAvo: ( {data}) => {return "Hello World"}
};

// 3 -  Init Server
const server = new ApolloServer({
  typeDefs,
  resolvers
});

server.listen().then(({ url }) => console.log(`Server is running on ${url}`));
