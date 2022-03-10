import fs from 'fs';
import path from 'path';

const modules = fs.readdirSync(path.join(__dirname, 'modules'))

const schemaFiles = modules.map(module => fs.readFileSync(path.join(__dirname, 'modules', module, "schema.graphql"), 'utf8')).join('\n')

const typeDefs = [fs.readFileSync(path.join(__dirname, "schema.graphql"), 'utf8')]

typeDefs.push(schemaFiles)

export default typeDefs
