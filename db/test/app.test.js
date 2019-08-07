const app = require('../server'),
request = require('supertest');

describe('Get/', ()=> {
  it('must say hello', (done)=> {
    request(app)
    .get('/')
    .expect(200, done)
  });
});