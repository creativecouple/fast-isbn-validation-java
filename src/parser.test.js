const {parse} = require('./parser');

test('unknown prefix', () => {
    expect(parse("977-012345678-7")).toBeNull();
    expect(parse("980-012345678-1")).toBeNull();
});

test('existing prefix ISBN13', () => {
    const {
        isbn,
        compact,
        prefix,
        group,
        publisher,
        title,
        checkdigit
    } = parse("978-312517154-1");

    expect(compact).toBe('9783125171541');
    expect(isbn).toBe('978-3-12-517154-1');
    expect(prefix).toBe('978');
    expect(group).toBe('3');
    expect(publisher).toBe('12');
    expect(title).toBe('517154');
    expect(checkdigit).toBe('1');
});

test('existing prefix ISBN10', () => {
    const {
        isbn,
        compact,
        prefix,
        group,
        publisher,
        title,
        checkdigit
    } = parse("123456789x");

    expect(compact).toBe('9781234567897');
    expect(isbn).toBe('978-1-234-56789-7');
    expect(prefix).toBe('978');
    expect(group).toBe('1');
    expect(publisher).toBe('234');
    expect(title).toBe('56789');
    expect(checkdigit).toBe('7');
});

test('unknown group', () => {
    expect(parse("978-611001122-8")).toBeNull();
    expect(parse("979-444444444-5")).toBeNull();
});

test('correct and wrong checkdigits', () => {
    expect(parse("978-123456789-0")).toBe(false);
    expect(parse("978-123456789-1")).toBe(false);
    expect(parse("978-123456789-2")).toBe(false);
    expect(parse("978-123456789-3")).toBe(false);
    expect(parse("978-123456789-4")).toBe(false);
    expect(parse("978-123456789-5")).toBe(false);
    expect(parse("978-123456789-6")).toBe(false);
    expect(parse("978-123456789-7")).not.toBe(false);
    expect(parse("978-123456789-8")).toBe(false);
    expect(parse("978-123456789-9")).toBe(false);
});

test('correct and wrong checkdigit ISBN10', () => {
    expect(parse("123456789-0")).toBe(false);
    expect(parse("123456789-1")).toBe(false);
    expect(parse("123456789-2")).toBe(false);
    expect(parse("123456789-3")).toBe(false);
    expect(parse("123456789-4")).toBe(false);
    expect(parse("123456789-5")).toBe(false);
    expect(parse("123456789-6")).toBe(false);
    expect(parse("123456789-7")).toBe(false);
    expect(parse("123456789-8")).toBe(false);
    expect(parse("123456789-9")).toBe(false);
    expect(parse("123456789-X")).not.toBe(false);
    expect(parse("123456789-x")).not.toBe(false);
});
