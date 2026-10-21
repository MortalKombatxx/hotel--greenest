# Hotel Greenest

Java console app for the Greenest Plant Hotel. Enter a plant name; the program
calculates how much liquid it needs and which liquid type to give. No GUI framework,
no database — just OOP and a simple loop.

## Run

In IntelliJ: open the project and run `Hotel.main`.

Type a plant name (`Igge`, `Laura`, `Meatloaf`, `Olof`), or `exit` to quit.

## How it is put together

1. `Hotel` creates the four plants, stores them in an array, reads input, and searches by name.
2. `Plant` holds shared data (name, height, cared-for status) and implements `LiquidNeed`.
3. `Palm` / `Cactus` / `CarnivorousPlant` each calculate their own amount and liquid type.
4. `LiquidType` is an enum for the allowed drinks.
5. Bad input (empty / unknown name) is handled with `if` checks so the program does not crash.

**Stack:** Java, IntelliJ, console `Scanner`, inheritance + interface + polymorphism (enum + encapsulation for VG).

| Class | What it is |
| --- | --- |
| `Hotel` | Front desk: input, search, print result |
| `Plant` | Shared base class |
| `LiquidNeed` | Interface: amount + liquid type |
| `Palm` / `Cactus` / `CarnivorousPlant` | Plant types with their formulas |
| `LiquidType` | Enum of drinks |

## Try it

- `Laura` → palm formula + tap water
- `Igge` → fixed cactus amount + mineral water
- `Meatloaf` → carnivorous formula + protein drink
- Unknown name / empty input → friendly message
- Same plant twice → already cared for
