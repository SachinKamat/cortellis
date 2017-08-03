/**
 * Created by SK00447696 on 7/25/17.
 */
when 'TO DO', {
    'failure' should: 'IN PROGRESS'
}

when 'TO DO', {
    'success' should: 'IN PROGRESS'
}
when 'IN PROGRESS', {
    'success' should: 'DONE'
}

when 'IN PROGRESS', {
    'failure' should: 'TO DO'
}
when 'DONE', {
    'failure' should: 'TO DO'
}
