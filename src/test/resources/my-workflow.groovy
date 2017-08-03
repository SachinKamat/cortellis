/**
 * Created by SK00447696 on 7/25/17.
 */
when 'To Do', {
    'success' should: 'In Progress'
}

when 'To Do', {
    'success' should: 'In Progress'
}
when 'In Progress', {
    'success' should: 'Done'
}

when 'In Progress', {
    'failure' should: 'To Do'
}
when 'Done', {
    'failure' should: 'To Do'
}
