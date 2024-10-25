# Todo backend for React Intro project

## Endpoints

### GET /todos

Returns a list of all todos.

### POST /todos

Creates a new todo.

#### Request body

```json
{
  "title": "string",
  "completed": "boolean"
}
```

### PUT /todos/:id

Updates a todo.

#### Request body

```json
{
  "title": "string",
  "completed": "boolean"
}
```

### DELETE /todos/:id

Deletes a todo.

