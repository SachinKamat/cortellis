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
    'error' should: 'To Do'
}
when 'Done', {
    'error' should: 'To Do'
}
