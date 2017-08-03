/**
 * Created by SK00447696 on 7/25/17.
 */
when 'To Do', {
    'error' should: 'To Do'
}

when 'To Do', {
    'success' should: 'Done'
}
when 'In Progress', {
    'success' should: 'Done'
}

when 'In Progress', {
    'error' should: 'To Do'
}
when 'Done', {
    'error' should: 'To Do'
}
when 'Done', {
    'success' should: 'Done'
}