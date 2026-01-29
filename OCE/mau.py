def fibonacci_sequence(n):
    """
    Generate a Fibonacci sequence with n terms.
    
    Time Complexity: O(n)
    Space Complexity: O(n)
    """
    if n <= 0:
        return []
    if n == 1:
        return [0]
    if n == 2:
        return [0, 1]

    sequence = [0, 1]
    for _ in range(2, n):
        sequence.append(sequence[-1] + sequence[-2])

    return sequence


def display_statistics(sequence):
    """Display basic statistics of the Fibonacci sequence"""
    total = sum(sequence)
    average = total / len(sequence)

    print("\nStatistics:")
    print("-" * 40)
    print(f"Sum of sequence : {total}")
    print(f"Average         : {average:.2f}")
    print(f"Maximum value   : {max(sequence)}")


def display_golden_ratio(sequence):
    """Display golden ratio approximation and convergence"""
    if len(sequence) < 2:
        return

    print("\nGolden Ratio Approximation")
    print("-" * 40)

    ratio = sequence[-1] / sequence[-2]
    print(f"Approximation (last two terms): {ratio:.10f}")
    print("Actual golden ratio (phi)     : 1.6180339887")

    # Show convergence (first few ratios)
    print("\nGolden ratio convergence:")
    for i in range(2, min(len(sequence), 10)):
        current_ratio = sequence[i] / sequence[i - 1]
        print(f"Term {i+1:2} ratio: {current_ratio:.6f}")


def main():
    print("\nFibonacci Sequence Generator")
    print("=" * 40)

    try:
        n = int(input("How many terms? (1–50): "))

        if not 1 <= n <= 50:
            print("❌ Please enter a number between 1 and 50.")
            return

        fibonacci = fibonacci_sequence(n)

        print(f"\nFirst {n} Fibonacci numbers:")
        print("-" * 40)
        for index, value in enumerate(fibonacci, start=1):
            print(f"Term {index:2}: {value:15}")

        display_golden_ratio(fibonacci)
        display_statistics(fibonacci)

    except ValueError:
        print("❌ Invalid input. Please enter a valid integer.")


if __name__ == "__main__":
    main()
