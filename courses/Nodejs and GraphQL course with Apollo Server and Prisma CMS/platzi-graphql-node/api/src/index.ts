import { ApolloServer } from 'apollo-server';
import typeDefs from './type-defs';

// 2 - Resolvers
const resolvers = {

};

// 3 -  Init Server
const server = new ApolloServer({
  typeDefs,
  resolvers
});

server.listen().then(({ url }) => console.log(`Server is running on ${url}`));
