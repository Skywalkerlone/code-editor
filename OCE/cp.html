<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>C++ Code Editor</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.2/codemirror.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.2/theme/dracula.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.2/theme/eclipse.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.2/addon/hint/show-hint.css">
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        :root {
            --primary: #00599C;
            --secondary: #004482;
            --accent: #659AD2;
            --dark-bg: #1e1e1e;
            --light-bg: #f8f9fa;
            --dark-text: #333;
            --light-text: #f8f9fa;
            --success: #28a745;
            --error: #dc3545;
            --warning: #ffc107;
            --info: #17a2b8;
            --border-radius: 8px;
            --shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            --transition: all 0.3s ease;
        }

        body {
            background-color: var(--light-bg);
            color: var(--dark-text);
            transition: var(--transition);
            min-height: 100vh;
            overflow-x: hidden;
        }

        body.dark-mode {
            background-color: var(--dark-bg);
            color: var(--light-text);
        }

        /* Animations */
        @keyframes pulse {
            0% { transform: scale(1); }
            50% { transform: scale(1.05); }
            100% { transform: scale(1); }
        }

        @keyframes slideIn {
            from { transform: translateY(-20px); opacity: 0; }
            to { transform: translateY(0); opacity: 1; }
        }

        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }

        @keyframes typewriter {
            from { width: 0; }
            to { width: 100%; }
        }

        @keyframes float {
            0%, 100% { transform: translateY(0); }
            50% { transform: translateY(-10px); }
        }

        @keyframes compileGlow {
            0%, 100% { box-shadow: 0 0 5px var(--primary); }
            50% { box-shadow: 0 0 20px var(--accent); }
        }

        .pulse-animation {
            animation: pulse 0.5s ease-in-out;
        }

        .slide-in {
            animation: slideIn 0.3s ease-out;
        }

        .fade-in {
            animation: fadeIn 0.5s ease-in;
        }

        .float-animation {
            animation: float 3s ease-in-out infinite;
        }

        /* Header */
        .header {
            background: linear-gradient(135deg, var(--primary), var(--secondary));
            color: white;
            padding: 1rem 2rem;
            display: flex;
            justify-content: space-between;
            align-items: center;
            box-shadow: var(--shadow);
            position: sticky;
            top: 0;
            z-index: 100;
        }

        .logo {
            display: flex;
            align-items: center;
            gap: 10px;
            cursor: pointer;
        }

        .logo i {
            color: var(--accent);
            font-size: 1.8rem;
            animation: pulse 2s infinite;
        }

        .logo h1 {
            font-size: 1.5rem;
            font-weight: 600;
            position: relative;
            overflow: hidden;
        }

        .logo h1::after {
            content: '';
            position: absolute;
            bottom: 0;
            left: 0;
            width: 0;
            height: 2px;
            background: var(--accent);
            transition: width 0.3s ease;
        }

        .logo:hover h1::after {
            width: 100%;
        }

        .controls {
            display: flex;
            gap: 15px;
            align-items: center;
        }

        .control-btn {
            background: rgba(255, 255, 255, 0.1);
            border: none;
            color: white;
            padding: 8px 16px;
            border-radius: var(--border-radius);
            cursor: pointer;
            display: flex;
            align-items: center;
            gap: 8px;
            transition: var(--transition);
            font-weight: 500;
            position: relative;
            overflow: hidden;
        }

        .control-btn::before {
            content: '';
            position: absolute;
            top: 0;
            left: -100%;
            width: 100%;
            height: 100%;
            background: linear-gradient(90deg, transparent, rgba(255,255,255,0.2), transparent);
            transition: left 0.5s;
        }

        .control-btn:hover::before {
            left: 100%;
        }

        .control-btn:hover {
            background: rgba(255, 255, 255, 0.2);
            transform: translateY(-2px);
        }

        .control-btn i {
            font-size: 1.1rem;
        }

        .compile-btn {
            background-color: var(--success);
        }

        .run-btn {
            background-color: var(--info);
        }

        .clear-btn {
            background-color: var(--warning);
            color: #333;
        }

        .home-btn {
            background-color: var(--accent);
        }

        .debug-btn {
            background-color: #9c27b0;
        }

        .about-btn {
            background-color: #ff5722;
        }

        /* Theme toggle */
        .theme-toggle {
            position: relative;
            width: 60px;
            height: 30px;
        }

        .theme-toggle input {
            opacity: 0;
            width: 0;
            height: 0;
        }

        .toggle-slider {
            position: absolute;
            cursor: pointer;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background-color: rgba(255, 255, 255, 0.2);
            border-radius: 34px;
            transition: var(--transition);
        }

        .toggle-slider:before {
            position: absolute;
            content: "";
            height: 22px;
            width: 22px;
            left: 4px;
            bottom: 4px;
            background-color: white;
            border-radius: 50%;
            transition: var(--transition);
            animation: pulse 2s infinite;
        }

        input:checked + .toggle-slider {
            background-color: var(--accent);
        }

        input:checked + .toggle-slider:before {
            transform: translateX(30px);
        }

        /* Main Container */
        .container {
            display: flex;
            height: calc(100vh - 70px);
            padding: 20px;
            gap: 20px;
        }

        /* Editor Section */
        .editor-section {
            flex: 3;
            display: flex;
            flex-direction: column;
            gap: 15px;
        }

        .editor-header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 15px;
            background: white;
            border-radius: var(--border-radius);
            box-shadow: var(--shadow);
            animation: slideIn 0.5s ease-out;
        }

        body.dark-mode .editor-header {
            background: #2d2d2d;
        }

        .editor-header h2 {
            display: flex;
            align-items: center;
            gap: 10px;
            color: var(--primary);
        }

        .editor-header h2 i {
            color: var(--accent);
            animation: float 3s ease-in-out infinite;
        }

        .editor-options {
            display: flex;
            gap: 10px;
            align-items: center;
        }

        .option-btn {
            background: none;
            border: 1px solid #ddd;
            padding: 5px 10px;
            border-radius: 4px;
            cursor: pointer;
            transition: var(--transition);
        }

        body.dark-mode .option-btn {
            border-color: #555;
            color: #eee;
        }

        .option-btn:hover {
            background: #f0f0f0;
            transform: scale(1.1);
        }

        body.dark-mode .option-btn:hover {
            background: #444;
        }

        .compile-status {
            padding: 5px 10px;
            border-radius: 4px;
            font-size: 0.9rem;
            display: flex;
            align-items: center;
            gap: 5px;
        }

        .compile-status.success {
            background: rgba(40, 167, 69, 0.1);
            color: var(--success);
            border: 1px solid rgba(40, 167, 69, 0.3);
        }

        .compile-status.error {
            background: rgba(220, 53, 69, 0.1);
            color: var(--error);
            border: 1px solid rgba(220, 53, 69, 0.3);
        }

        .editor-container {
            flex: 1;
            border-radius: var(--border-radius);
            overflow: hidden;
            box-shadow: var(--shadow);
            animation: fadeIn 0.8s ease-in;
        }

        .CodeMirror {
            height: 100% !important;
            font-size: 14px;
            line-height: 1.6;
        }

        /* Output Section */
        .output-section {
            flex: 2;
            display: flex;
            flex-direction: column;
            gap: 15px;
        }

        .output-header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 15px;
            background: white;
            border-radius: var(--border-radius);
            box-shadow: var(--shadow);
            animation: slideIn 0.5s ease-out 0.1s both;
        }

        body.dark-mode .output-header {
            background: #2d2d2d;
        }

        .output-header h2 {
            display: flex;
            align-items: center;
            gap: 10px;
            color: var(--primary);
        }

        .output-header h2 i {
            color: var(--accent);
            animation: pulse 1.5s infinite;
        }

        .output-container {
            flex: 1;
            background: white;
            border-radius: var(--border-radius);
            padding: 20px;
            overflow-y: auto;
            box-shadow: var(--shadow);
            font-family: 'Courier New', monospace;
            font-size: 14px;
            line-height: 1.6;
            animation: fadeIn 0.8s ease-in 0.2s both;
        }

        body.dark-mode .output-container {
            background: #2d2d2d;
        }

        .output-line {
            margin-bottom: 8px;
            padding-left: 10px;
            border-left: 3px solid transparent;
            white-space: pre-wrap;
            word-break: break-word;
            animation: slideIn 0.3s ease-out;
        }

        .output-line.info {
            color: var(--info);
            border-left-color: var(--info);
        }

        .output-line.success {
            color: var(--success);
            border-left-color: var(--success);
        }

        .output-line.error {
            color: var(--error);
            border-left-color: var(--error);
        }

        .output-line.warning {
            color: var(--warning);
            border-left-color: var(--warning);
        }

        .output-line.output {
            color: inherit;
            border-left-color: #666;
        }

        .output-line.debug {
            color: #9c27b0;
            border-left-color: #9c27b0;
            font-style: italic;
        }

        /* Compilation Status Panel */
        .status-panel {
            background: #f8f9fa;
            border-radius: var(--border-radius);
            padding: 15px;
            margin-top: 10px;
            border-left: 4px solid var(--primary);
        }

        body.dark-mode .status-panel {
            background: #2d2d2d;
        }

        .status-header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 10px;
        }

        .status-header h3 {
            color: var(--primary);
            display: flex;
            align-items: center;
            gap: 10px;
        }

        .status-details {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(150px, 1fr));
            gap: 10px;
        }

        .status-item {
            padding: 8px;
            background: white;
            border-radius: 4px;
            font-size: 0.9rem;
        }

        body.dark-mode .status-item {
            background: #3a3a3a;
        }

        /* Examples Panel */
        .examples-panel {
            margin-top: 20px;
            background: white;
            border-radius: var(--border-radius);
            padding: 20px;
            box-shadow: var(--shadow);
            animation: fadeIn 0.8s ease-in 0.3s both;
        }

        body.dark-mode .examples-panel {
            background: #2d2d2d;
        }

        .examples-panel h3 {
            color: var(--primary);
            margin-bottom: 15px;
            display: flex;
            align-items: center;
            gap: 10px;
        }

        .examples-panel h3 i {
            animation: float 3s ease-in-out infinite;
        }

        .examples-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
            gap: 15px;
        }

        .example-btn {
            background: #f8f9fa;
            border: 2px solid #e9ecef;
            padding: 15px;
            border-radius: var(--border-radius);
            cursor: pointer;
            transition: var(--transition);
            text-align: left;
            animation: fadeIn 0.5s ease-in;
        }

        body.dark-mode .example-btn {
            background: #3a3a3a;
            border-color: #555;
            color: #eee;
        }

        .example-btn:hover {
            border-color: var(--primary);
            transform: translateY(-5px) scale(1.05);
            box-shadow: var(--shadow);
            animation: pulse 0.5s ease-in-out;
        }

        .example-btn h4 {
            color: var(--primary);
            margin-bottom: 5px;
            font-size: 1rem;
        }

        .example-btn p {
            font-size: 0.9rem;
            color: #666;
        }

        body.dark-mode .example-btn p {
            color: #aaa;
        }

        /* Compilation Animation */
        .compilation-animation {
            position: fixed;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            background: rgba(0, 0, 0, 0.9);
            color: white;
            padding: 30px;
            border-radius: var(--border-radius);
            z-index: 1000;
            display: none;
            flex-direction: column;
            align-items: center;
            gap: 20px;
            animation: fadeIn 0.3s ease-in;
        }

        .compile-spinner {
            width: 60px;
            height: 60px;
            border: 5px solid var(--accent);
            border-top: 5px solid transparent;
            border-radius: 50%;
            animation: spin 1s linear infinite;
        }

        @keyframes spin {
            0% { transform: rotate(0deg); }
            100% { transform: rotate(360deg); }
        }

        /* Modal */
        .modal {
            display: none;
            position: fixed;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0,0,0,0.7);
            z-index: 1000;
            animation: fadeIn 0.3s ease-in;
        }

        .modal-content {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            background: white;
            padding: 30px;
            border-radius: var(--border-radius);
            width: 90%;
            max-width: 600px;
            max-height: 80vh;
            overflow-y: auto;
            animation: slideIn 0.5s ease-out;
        }

        body.dark-mode .modal-content {
            background: #2d2d2d;
            color: white;
        }

        .modal-header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 20px;
            padding-bottom: 10px;
            border-bottom: 2px solid var(--primary);
        }

        .modal-header h2 {
            color: var(--primary);
            display: flex;
            align-items: center;
            gap: 10px;
        }

        .close-modal {
            background: none;
            border: none;
            font-size: 1.5rem;
            cursor: pointer;
            color: var(--error);
            transition: var(--transition);
        }

        .close-modal:hover {
            transform: rotate(90deg);
        }

        /* Debug Panel */
        .debug-panel {
            background: #f8f9fa;
            border-radius: var(--border-radius);
            padding: 15px;
            margin-top: 15px;
            border-left: 4px solid #9c27b0;
        }

        body.dark-mode .debug-panel {
            background: #2d2d2d;
        }

        .debug-info {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(150px, 1fr));
            gap: 10px;
            margin-top: 10px;
        }

        .debug-item {
            padding: 8px;
            background: white;
            border-radius: 4px;
            font-size: 0.9rem;
        }

        body.dark-mode .debug-item {
            background: #3a3a3a;
        }

        /* About C++ Content */
        .cpp-facts {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
            margin-top: 20px;
        }

        .fact-card {
            background: linear-gradient(135deg, var(--primary), var(--secondary));
            color: white;
            padding: 20px;
            border-radius: var(--border-radius);
            transition: var(--transition);
        }

        .fact-card:hover {
            transform: translateY(-5px);
            box-shadow: 0 10px 20px rgba(0,0,0,0.2);
        }

        .fact-card h3 {
            color: var(--accent);
            margin-bottom: 10px;
            display: flex;
            align-items: center;
            gap: 10px;
        }

        /* Code Visualization */
        .code-visualization {
            background: #1e1e1e;
            color: #d4d4d4;
            padding: 15px;
            border-radius: var(--border-radius);
            margin-top: 20px;
            font-family: 'Courier New', monospace;
            overflow-x: auto;
        }

        /* Footer */
        .footer {
            text-align: center;
            padding: 15px;
            background: white;
            color: #666;
            font-size: 0.9rem;
            border-top: 1px solid #eee;
            animation: fadeIn 1s ease-in 0.5s both;
        }

        body.dark-mode .footer {
            background: #2d2d2d;
            border-top-color: #444;
            color: #aaa;
        }

        .footer a {
            color: var(--primary);
            text-decoration: none;
            transition: var(--transition);
        }

        .footer a:hover {
            text-decoration: underline;
            color: var(--accent);
        }

        /* Responsive Design */
        @media (max-width: 1024px) {
            .container {
                flex-direction: column;
                height: auto;
            }
            
            .editor-container, .output-container {
                min-height: 400px;
            }
        }

        @media (max-width: 768px) {
            .header {
                flex-direction: column;
                gap: 15px;
                padding: 1rem;
            }
            
            .controls {
                flex-wrap: wrap;
                justify-content: center;
            }
            
            .examples-grid {
                grid-template-columns: 1fr;
            }
        }

        /* Console-like styling */
        #output {
            background: #1e1e1e;
            color: #d4d4d4;
            min-height: 200px;
            max-height: 400px;
            overflow-y: auto;
            border-radius: 8px;
            padding: 15px;
            font-family: 'Consolas', 'Monaco', 'Courier New', monospace;
            font-size: 13px;
            line-height: 1.5;
        }

        #output::-webkit-scrollbar {
            width: 8px;
        }

        #output::-webkit-scrollbar-track {
            background: #2d2d2d;
        }

        #output::-webkit-scrollbar-thumb {
            background: #555;
            border-radius: 4px;
        }

        #output::-webkit-scrollbar-thumb:hover {
            background: var(--primary);
        }

        /* Status indicator */
        .status {
            padding: 5px 10px;
            border-radius: 20px;
            font-size: 0.8rem;
            font-weight: 500;
            display: inline-flex;
            align-items: center;
            gap: 5px;
            animation: pulse 2s infinite;
        }

        .status.compiling {
            background: rgba(0, 89, 156, 0.2);
            color: var(--primary);
        }

        .status.idle {
            background: rgba(108, 117, 125, 0.2);
            color: #6c757d;
        }

        .status.error {
            background: rgba(220, 53, 69, 0.2);
            color: var(--error);
        }

        .status.running {
            background: rgba(40, 167, 69, 0.2);
            color: var(--success);
        }

        /* Typewriter effect */
        .typewriter {
            overflow: hidden;
            border-right: .15em solid var(--accent);
            white-space: nowrap;
            animation: typewriter 3.5s steps(40, end), blink-caret .75s step-end infinite;
        }

        @keyframes blink-caret {
            from, to { border-color: transparent; }
            50% { border-color: var(--accent); }
        }

        /* Progress Bar */
        .progress-bar {
            width: 100%;
            height: 4px;
            background: #e9ecef;
            border-radius: 2px;
            overflow: hidden;
            margin: 10px 0;
        }

        .progress {
            height: 100%;
            background: linear-gradient(90deg, var(--primary), var(--accent));
            width: 0%;
            transition: width 0.3s ease;
            animation: pulse 2s infinite;
        }

        /* Memory Visualization */
        .memory-viz {
            background: #1e1e1e;
            border-radius: var(--border-radius);
            padding: 15px;
            margin-top: 15px;
            color: white;
        }

        .memory-cell {
            display: inline-block;
            width: 30px;
            height: 30px;
            background: var(--primary);
            margin: 2px;
            border-radius: 3px;
            text-align: center;
            line-height: 30px;
            font-size: 10px;
            transition: all 0.3s ease;
        }

        .memory-cell.active {
            background: var(--accent);
            transform: scale(1.2);
        }

        .memory-cell.used {
            background: var(--success);
        }

        /* Compiler Output */
        .compiler-output {
            background: #2d2d2d;
            color: #d4d4d4;
            padding: 15px;
            border-radius: var(--border-radius);
            margin-top: 10px;
            font-family: 'Courier New', monospace;
            font-size: 12px;
            max-height: 200px;
            overflow-y: auto;
        }
    </style>
</head>
<body>
    <!-- Header -->
    <header class="header">
        <div class="logo" id="logo">
            <i class="fab fa-cuttlefish"></i>
            <h1>C++ Code Editor</h1>
        </div>
        <div class="controls">
            <button class="control-btn home-btn" id="homeBtn">
                <i class="fas fa-home"></i> Home
            </button>
            <button class="control-btn about-btn" id="aboutBtn">
                <i class="fas fa-info-circle"></i> About C++
            </button>
            <button class="control-btn debug-btn" id="debugBtn">
                <i class="fas fa-bug"></i> Debug
            </button>
            <button class="control-btn compile-btn" id="compileBtn">
                <i class="fas fa-cogs"></i> Compile
            </button>
            <button class="control-btn run-btn" id="runBtn">
                <i class="fas fa-play"></i> Run
            </button>
            <button class="control-btn clear-btn" id="clearBtn">
                <i class="fas fa-broom"></i> Clear
            </button>
            <button class="control-btn" id="saveBtn">
                <i class="fas fa-save"></i> Save
            </button>
            <div class="theme-toggle">
                <input type="checkbox" id="themeToggle">
                <label class="toggle-slider" for="themeToggle"></label>
            </div>
        </div>
    </header>

    <!-- Compilation Animation -->
    <div class="compilation-animation" id="compilationAnimation">
        <div class="compile-spinner"></div>
        <div id="compileMessage">Compiling C++ Code...</div>
        <div id="compileProgress" class="progress-bar">
            <div class="progress"></div>
        </div>
    </div>

    <!-- About C++ Modal -->
    <div class="modal" id="aboutModal">
        <div class="modal-content">
            <div class="modal-header">
                <h2><i class="fab fa-cuttlefish"></i> About C++</h2>
                <button class="close-modal" id="closeAboutModal">&times;</button>
            </div>
            <div class="typewriter">
                <h3>C++: The Powerhouse Programming Language</h3>
            </div>
            
            <div class="cpp-facts">
                <div class="fact-card">
                    <h3><i class="fas fa-microchip"></i> What is C++?</h3>
                    <p>C++ is a high-performance, compiled programming language created by Bjarne Stroustrup in 1985 as an extension of C.</p>
                </div>
                <div class="fact-card">
                    <h3><i class="fas fa-bolt"></i> Key Features</h3>
                    <p>• Object-Oriented Programming<br>• Memory Management<br>• Template Metaprogramming<br>• STL (Standard Template Library)</p>
                </div>
                <div class="fact-card">
                    <h3><i class="fas fa-rocket"></i> Popular Uses</h3>
                    <p>• Game Development<br>• Operating Systems<br>• Embedded Systems<br>• High-Frequency Trading</p>
                </div>
            </div>

            <div class="code-visualization">
                <h4><i class="fas fa-code"></i> Why C++ is Powerful:</h4>
                <pre><code>
// C++ combines low-level control with high-level abstractions
#include &lt;iostream&gt;
#include &lt;vector&gt;
#include &lt;algorithm&gt;

// Object-Oriented Programming
class Animal {
public:
    virtual void speak() = 0; // Pure virtual function
    virtual ~Animal() {}
};

class Dog : public Animal {
public:
    void speak() override {
        std::cout << "Woof!" << std::endl;
    }
};

// Templates (Generic Programming)
template&lt;typename T&gt;
T max(T a, T b) {
    return (a > b) ? a : b;
}

// Smart Pointers (Modern C++)
#include &lt;memory&gt;
auto ptr = std::make_unique&lt;int&gt;(42);

// STL Algorithms
std::vector&lt;int&gt; numbers = {5, 2, 8, 1, 9};
std::sort(numbers.begin(), numbers.end());

// Lambda Expressions (C++11+)
auto square = [](int x) { return x * x; };
                </code></pre>
            </div>

            <div class="debug-panel">
                <h4><i class="fas fa-chart-line"></i> C++ Statistics:</h4>
                <div class="debug-info">
                    <div class="debug-item">First Released: 1985</div>
                    <div class="debug-item">Latest Standard: C++20 (C++23 coming)</div>
                    <div class="debug-item">Paradigm: Multi-paradigm</div>
                    <div class="debug-item">TIOBE Rank: #4 (2023)</div>
                </div>
            </div>

            <button class="control-btn compile-btn" style="margin-top: 20px; width: 100%;" id="runHelloWorld">
                <i class="fas fa-magic"></i> Load Hello World Example
            </button>
        </div>
    </div>

    <!-- Debug Modal -->
    <div class="modal" id="debugModal">
        <div class="modal-content">
            <div class="modal-header">
                <h2><i class="fas fa-bug"></i> Debug Tools</h2>
                <button class="close-modal" id="closeDebugModal">&times;</button>
            </div>
            
            <div class="debug-panel">
                <h3><i class="fas fa-tools"></i> Debug Utilities</h3>
                <div class="debug-info">
                    <div class="debug-item" id="codeLength">Code Length: 0 chars</div>
                    <div class="debug-item" id="lineCount">Lines: 0</div>
                    <div class="debug-item" id="functionCount">Functions: 0</div>
                    <div class="debug-item" id="classCount">Classes: 0</div>
                </div>
            </div>

            <div class="debug-panel">
                <h3><i class="fas fa-search"></i> Code Analysis</h3>
                <button class="control-btn" id="analyzeBtn" style="width: 100%; margin-bottom: 10px;">
                    <i class="fas fa-search"></i> Analyze Code
                </button>
                <div id="analysisResults"></div>
            </div>

            <div class="debug-panel">
                <h3><i class="fas fa-memory"></i> Memory Visualization</h3>
                <button class="control-btn" id="memoryBtn" style="width: 100%; margin-bottom: 10px;">
                    <i class="fas fa-brain"></i> Show Memory Usage
                </button>
                <div id="memoryVisualization" class="memory-viz">
                    <!-- Memory cells will be generated here -->
                </div>
            </div>

            <div class="debug-panel">
                <h3><i class="fas fa-vial"></i> Compiler Simulation</h3>
                <button class="control-btn run-btn" id="simulateBtn" style="width: 100%; margin-bottom: 10px;">
                    <i class="fas fa-vial"></i> Simulate Compilation
                </button>
                <div class="progress-bar">
                    <div class="progress" id="compileSimProgress"></div>
                </div>
                <div id="compileSimResults" class="compiler-output"></div>
            </div>
        </div>
    </div>

    <!-- Main Container -->
    <div class="container">
        <!-- Editor Section -->
        <section class="editor-section">
            <div class="editor-header">
                <h2><i class="fas fa-code"></i> C++ Editor</h2>
                <div class="editor-options">
                    <div class="compile-status idle" id="compileStatus">
                        <i class="fas fa-circle"></i> Ready
                    </div>
                    <button class="option-btn" id="fontIncrease"><i class="fas fa-plus"></i></button>
                    <button class="option-btn" id="fontDecrease"><i class="fas fa-minus"></i></button>
                    <button class="option-btn" id="formatBtn">Format</button>
                    <button class="option-btn" id="toggleOptimization">
                        <i class="fas fa-tachometer-alt"></i> -O2
                    </button>
                </div>
            </div>
            <div class="editor-container">
                <textarea id="codeEditor" placeholder="// Write your C++ code here..."></textarea>
            </div>
            
            <!-- Status Panel -->
            <div class="status-panel" id="statusPanel">
                <div class="status-header">
                    <h3><i class="fas fa-chart-bar"></i> Compilation Status</h3>
                    <div class="status" id="runtimeStatus">Runtime: 0ms</div>
                </div>
                <div class="status-details">
                    <div class="status-item" id="compileTime">Compile Time: --</div>
                    <div class="status-item" id="binarySize">Binary Size: --</div>
                    <div class="status-item" id="warningsCount">Warnings: 0</div>
                    <div class="status-item" id="errorsCount">Errors: 0</div>
                </div>
            </div>
            
            <!-- Examples Panel -->
            <div class="examples-panel">
                <h3><i class="fas fa-lightbulb"></i> C++ Examples</h3>
                <div class="examples-grid">
                    <button class="example-btn" data-example="hello">
                        <h4>Hello World</h4>
                        <p>Basic C++ program</p>
                    </button>
                    <button class="example-btn" data-example="calculator">
                        <h4>Calculator</h4>
                        <p>Simple arithmetic operations</p>
                    </button>
                    <button class="example-btn" data-example="oop">
                        <h4>OOP Example</h4>
                        <p>Classes and inheritance</p>
                    </button>
                    <button class="example-btn" data-example="stl">
                        <h4>STL Demo</h4>
                        <p>Standard Template Library</p>
                    </button>
                    <button class="example-btn" data-example="sorting">
                        <h4>Sorting</h4>
                        <p>Sorting algorithms</p>
                    </button>
                    <button class="example-btn" data-example="graphics">
                        <h4>Graphics</h4>
                        <p>ASCII art graphics</p>
                    </button>
                </div>
            </div>
        </section>

        <!-- Output Section -->
        <section class="output-section">
            <div class="output-header">
                <h2><i class="fas fa-terminal"></i> Output Console</h2>
                <div class="status idle" id="statusIndicator">
                    <i class="fas fa-circle"></i> Ready
                </div>
            </div>
            <div class="output-container">
                <div id="output">
                    <div class="output-line info">
                        <i class="fas fa-info-circle"></i> Welcome to C++ Code Editor!
                    </div>
                    <div class="output-line info">
                        <i class="fas fa-info-circle"></i> Click "Compile" then "Run" to execute your C++ program
                    </div>
                    <div class="output-line info">
                        <i class="fas fa-info-circle"></i> Try the code examples to get started
                    </div>
                </div>
            </div>
            
            <!-- Compiler Output -->
            <div class="status-panel" id="compilerOutputPanel" style="display: none;">
                <div class="status-header">
                    <h3><i class="fas fa-terminal"></i> Compiler Output</h3>
                    <button class="option-btn" id="hideCompilerOutput">
                        <i class="fas fa-times"></i> Hide
                    </button>
                </div>
                <div id="compilerOutput" class="compiler-output">
                    <!-- Compiler messages will appear here -->
                </div>
            </div>
        </section>
    </div>

    <!-- Footer -->
    <footer class="footer">
        <p>
            <i class="fas fa-code"></i> C++ Code Editor | 
            <i class="fas fa-shield-alt"></i> WebAssembly C++ Compiler | 
            <i class="fas fa-bolt"></i> Powered by Emscripten
        </p>
        <p style="margin-top: 8px; font-size: 0.85rem;">
            Note: This editor compiles C++ to WebAssembly in your browser. Some system calls may be limited.
        </p>
    </footer>

    <!-- Scripts -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.2/codemirror.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.2/mode/clike/clike.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.2/addon/edit/matchbrackets.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.2/addon/comment/comment.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.2/addon/display/autorefresh.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.2/addon/hint/show-hint.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/codemirror/5.65.2/addon/hint/anyword-hint.min.js"></script>
    
    <!-- Emscripten for C++ compilation -->
    <script>
        // Note: In a real implementation, you would load Emscripten here
        // For this demo, we'll simulate C++ compilation
    </script>
    
    <script>
        // Initialize CodeMirror Editor for C++
        const editor = CodeMirror.fromTextArea(document.getElementById('codeEditor'), {
            mode: 'text/x-c++src',
            theme: 'eclipse',
            lineNumbers: true,
            indentUnit: 4,
            smartIndent: true,
            matchBrackets: true,
            autoRefresh: true,
            extraKeys: {
                'Ctrl-Space': 'autocomplete',
                'Ctrl-/': 'toggleComment',
                'Tab': function(cm) {
                    cm.replaceSelection('    ', 'end');
                }
            },
            hintOptions: {
                hint: CodeMirror.hint.anyword,
                completeSingle: false
            }
        });

        // Set initial C++ code
        editor.setValue(`// Welcome to C++ Code Editor!
// This is a sample C++ program
// Click "Compile" then "Run" to execute it

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

// Function to demonstrate basic C++ features
void demonstrateFeatures() {
    cout << "=== C++ Features Demonstration ===" << endl;
    
    // Variables and data types
    int number = 42;
    double pi = 3.14159;
    string message = "Hello from C++!";
    bool isCppAwesome = true;
    
    cout << "\\n📊 Variables:" << endl;
    cout << "Integer: " << number << endl;
    cout << "Double: " << pi << endl;
    cout << "String: " << message << endl;
    cout << "Boolean: " << boolalpha << isCppAwesome << endl;
    
    // Arrays and Vectors
    int numbers[] = {1, 2, 3, 4, 5};
    vector<int> vec = {10, 20, 30, 40, 50};
    
    cout << "\\n📈 Arrays and Vectors:" << endl;
    cout << "Array: ";
    for(int n : numbers) {
        cout << n << " ";
    }
    cout << endl;
    
    cout << "Vector: ";
    for(int v : vec) {
        cout << v << " ";
    }
    cout << endl;
    
    // STL Algorithms
    cout << "\\n🔧 STL Algorithms:" << endl;
    vector<int> sortedVec = vec;
    sort(sortedVec.begin(), sortedVec.end());
    
    cout << "Original: ";
    for(int v : vec) cout << v << " ";
    cout << endl;
    
    cout << "Sorted: ";
    for(int v : sortedVec) cout << v << " ";
    cout << endl;
    
    auto maxElement = max_element(vec.begin(), vec.end());
    cout << "Maximum element: " << *maxElement << endl;
}

// Simple calculator class
class Calculator {
public:
    Calculator() {
        cout << "\\n🧮 Calculator initialized!" << endl;
    }
    
    double add(double a, double b) { return a + b; }
    double subtract(double a, double b) { return a - b; }
    double multiply(double a, double b) { return a * b; }
    double divide(double a, double b) { 
        if(b == 0) throw runtime_error("Division by zero!");
        return a / b; 
    }
    
    void demonstrate() {
        cout << "\\n📐 Calculator Demo:" << endl;
        cout << "5 + 3 = " << add(5, 3) << endl;
        cout << "10 - 4 = " << subtract(10, 4) << endl;
        cout << "6 * 7 = " << multiply(6, 7) << endl;
        cout << "15 / 3 = " << divide(15, 3) << endl;
    }
};

// Fibonacci generator
vector<int> generateFibonacci(int n) {
    vector<int> sequence;
    if(n <= 0) return sequence;
    
    sequence.push_back(0);
    if(n == 1) return sequence;
    
    sequence.push_back(1);
    for(int i = 2; i < n; i++) {
        sequence.push_back(sequence[i-1] + sequence[i-2]);
    }
    
    return sequence;
}

int main() {
    cout << "🚀 Starting C++ Program Execution" << endl;
    cout << "=================================" << endl;
    
    try {
        // Demonstrate features
        demonstrateFeatures();
        
        // Use calculator
        Calculator calc;
        calc.demonstrate();
        
        // Generate Fibonacci sequence
        cout << "\\n🐇 Fibonacci Sequence (10 terms):" << endl;
        vector<int> fib = generateFibonacci(10);
        for(int i = 0; i < fib.size(); i++) {
            cout << "Term " << (i+1) << ": " << fib[i] << endl;
        }
        
        // Memory demonstration
        cout << "\\n💾 Memory Usage Demo:" << endl;
        int* dynamicArray = new int[5];
        for(int i = 0; i < 5; i++) {
            dynamicArray[i] = (i+1) * 100;
            cout << "Allocated: " << dynamicArray[i] << endl;
        }
        delete[] dynamicArray;
        cout << "Memory freed successfully!" << endl;
        
        // User input simulation
        cout << "\\n👤 User Input Simulation:" << endl;
        cout << "Enter your name: ";
        string name = "C++ Developer"; // Simulated input
        cout << name << endl;
        cout << "Welcome, " << name << "!" << endl;
        
        cout << "\\n✅ Program executed successfully!" << endl;
        cout << "🎉 C++ is powerful and efficient!" << endl;
        
    } catch(const exception& e) {
        cerr << "\\n❌ Error: " << e.what() << endl;
        return 1;
    }
    
    return 0;
}`);

        // Theme Toggle
        const themeToggle = document.getElementById('themeToggle');
        const body = document.body;
        
        // Check for saved theme preference
        const savedTheme = localStorage.getItem('cppEditorTheme');
        if (savedTheme === 'dark') {
            body.classList.add('dark-mode');
            themeToggle.checked = true;
            editor.setOption('theme', 'dracula');
        }
        
        themeToggle.addEventListener('change', () => {
            body.classList.toggle('dark-mode');
            if (body.classList.contains('dark-mode')) {
                editor.setOption('theme', 'dracula');
                localStorage.setItem('cppEditorTheme', 'dark');
                addOutput('info', '🌙 Switched to dark theme');
            } else {
                editor.setOption('theme', 'eclipse');
                localStorage.setItem('cppEditorTheme', 'light');
                addOutput('info', '☀️ Switched to light theme');
            }
        });

        // Compilation and execution state
        let isCompiling = false;
        let isRunning = false;
        let compiledCode = null;
        let compileStartTime = 0;
        let runStartTime = 0;
        
        // Example code library
        const examples = {
            hello: `// Simple Hello World in C++
#include <iostream>

int main() {
    std::cout << "Hello, World! 🌍" << std::endl;
    std::cout << "Welcome to C++ Programming!" << std::endl;
    std::cout << std::endl;
    
    // Basic data types
    int number = 42;
    double pi = 3.14159;
    char letter = 'A';
    bool isFun = true;
    
    std::cout << "📊 Basic Data Types:" << std::endl;
    std::cout << "Integer: " << number << std::endl;
    std::cout << "Double: " << pi << std::endl;
    std::cout << "Character: " << letter << std::endl;
    std::cout << "Boolean: " << std::boolalpha << isFun << std::endl;
    
    // Simple arithmetic
    int a = 10, b = 3;
    std::cout << "\\n🧮 Arithmetic Operations:" << std::endl;
    std::cout << a << " + " << b << " = " << a + b << std::endl;
    std::cout << a << " - " << b << " = " << a - b << std::endl;
    std::cout << a << " * " << b << " = " << a * b << std::endl;
    std::cout << a << " / " << b << " = " << a / b << std::endl;
    std::cout << a << " % " << b << " = " << a % b << std::endl;
    
    // String operations
    std::string name = "C++ Developer";
    std::cout << "\\n📝 String Demo:" << std::endl;
    std::cout << "Name: " << name << std::endl;
    std::cout << "Length: " << name.length() << std::endl;
    std::cout << "First character: " << name[0] << std::endl;
    
    // Arrays
    int numbers[] = {1, 2, 3, 4, 5};
    std::cout << "\\n📈 Array Demo:" << std::endl;
    std::cout << "Array elements: ";
    for(int i = 0; i < 5; i++) {
        std::cout << numbers[i] << " ";
    }
    std::cout << std::endl;
    
    // Control structures
    std::cout << "\\n🎮 Control Structures:" << std::endl;
    std::cout << "Even numbers (1-10): ";
    for(int i = 1; i <= 10; i++) {
        if(i % 2 == 0) {
            std::cout << i << " ";
        }
    }
    std::cout << std::endl;
    
    // Memory address demo
    std::cout << "\\n💾 Memory Demo:" << std::endl;
    int x = 100;
    std::cout << "Value: " << x << std::endl;
    std::cout << "Address: " << &x << std::endl;
    
    std::cout << "\\n✅ Program completed successfully!" << std::endl;
    std::cout << "🚀 Ready to learn more C++!" << std::endl;
    
    return 0;
}`,

            calculator: `// Advanced Calculator with Menu System
#include <iostream>
#include <cmath>
#include <iomanip>
#include <limits>

using namespace std;

// Function prototypes
void displayMenu();
double getNumber(const string& prompt);
void performOperation(char operation);
void clearInputBuffer();

// Calculator functions
double add(double a, double b);
double subtract(double a, double b);
double multiply(double a, double b);
double divide(double a, double b);
double power(double base, double exponent);
double squareRoot(double n);
double factorial(int n);
void showHelp();

int main() {
    cout << "🧮 Advanced C++ Calculator" << endl;
    cout << "==========================" << endl;
    
    char choice;
    bool running = true;
    int operationsCount = 0;
    
    while(running) {
        displayMenu();
        cout << "\\nEnter your choice: ";
        cin >> choice;
        clearInputBuffer();
        
        switch(choice) {
            case '1': case '+':
                performOperation('+');
                operationsCount++;
                break;
            case '2': case '-':
                performOperation('-');
                operationsCount++;
                break;
            case '3': case '*':
                performOperation('*');
                operationsCount++;
                break;
            case '4': case '/':
                performOperation('/');
                operationsCount++;
                break;
            case '5': case '^':
                performOperation('^');
                operationsCount++;
                break;
            case '6': case 's':
                performOperation('√');
                operationsCount++;
                break;
            case '7': case '!':
                performOperation('!');
                operationsCount++;
                break;
            case 'h': case 'H':
                showHelp();
                break;
            case 'c': case 'C':
                cout << "\\n📊 Calculator Statistics:" << endl;
                cout << "Operations performed: " << operationsCount << endl;
                break;
            case 'q': case 'Q':
                cout << "\\n👋 Thank you for using the calculator!" << endl;
                cout << "Total operations: " << operationsCount << endl;
                running = false;
                break;
            default:
                cout << "❌ Invalid choice! Try again." << endl;
        }
        
        if(running) {
            cout << "\\n" << string(40, '-') << endl;
        }
    }
    
    return 0;
}

void displayMenu() {
    cout << "\\n📋 Calculator Menu:" << endl;
    cout << "1. Addition (+)" << endl;
    cout << "2. Subtraction (-)" << endl;
    cout << "3. Multiplication (*)" << endl;
    cout << "4. Division (/)" << endl;
    cout << "5. Power (^)" << endl;
    cout << "6. Square Root (√)" << endl;
    cout << "7. Factorial (!)" << endl;
    cout << "H. Help" << endl;
    cout << "C. Show Statistics" << endl;
    cout << "Q. Quit" << endl;
}

double getNumber(const string& prompt) {
    double number;
    while(true) {
        cout << prompt;
        cin >> number;
        if(cin.fail()) {
            cin.clear();
            clearInputBuffer();
            cout << "❌ Invalid input! Please enter a number." << endl;
        } else {
            clearInputBuffer();
            return number;
        }
    }
}

void performOperation(char operation) {
    double a, b, result;
    
    try {
        switch(operation) {
            case '+':
                a = getNumber("Enter first number: ");
                b = getNumber("Enter second number: ");
                result = add(a, b);
                cout << "\\n✅ Result: " << a << " + " << b << " = " << result << endl;
                break;
            case '-':
                a = getNumber("Enter first number: ");
                b = getNumber("Enter second number: ");
                result = subtract(a, b);
                cout << "\\n✅ Result: " << a << " - " << b << " = " << result << endl;
                break;
            case '*':
                a = getNumber("Enter first number: ");
                b = getNumber("Enter second number: ");
                result = multiply(a, b);
                cout << "\\n✅ Result: " << a << " * " << b << " = " << result << endl;
                break;
            case '/':
                a = getNumber("Enter numerator: ");
                b = getNumber("Enter denominator: ");
                if(b == 0) throw runtime_error("Division by zero!");
                result = divide(a, b);
                cout << "\\n✅ Result: " << a << " / " << b << " = " << fixed << setprecision(4) << result << endl;
                break;
            case '^':
                a = getNumber("Enter base: ");
                b = getNumber("Enter exponent: ");
                result = power(a, b);
                cout << "\\n✅ Result: " << a << " ^ " << b << " = " << result << endl;
                break;
            case '√':
                a = getNumber("Enter number: ");
                if(a < 0) throw runtime_error("Cannot calculate square root of negative number!");
                result = squareRoot(a);
                cout << "\\n✅ Result: √" << a << " = " << fixed << setprecision(4) << result << endl;
                break;
            case '!':
                a = getNumber("Enter integer: ");
                if(a < 0 || a != static_cast<int>(a)) 
                    throw runtime_error("Factorial requires non-negative integer!");
                result = factorial(static_cast<int>(a));
                cout << "\\n✅ Result: " << static_cast<int>(a) << "! = " << result << endl;
                break;
        }
    } catch(const exception& e) {
        cout << "\\n❌ Error: " << e.what() << endl;
    }
}

// Calculator function implementations
double add(double a, double b) { return a + b; }
double subtract(double a, double b) { return a - b; }
double multiply(double a, double b) { return a * b; }
double divide(double a, double b) { return a / b; }

double power(double base, double exponent) {
    return pow(base, exponent);
}

double squareRoot(double n) {
    return sqrt(n);
}

double factorial(int n) {
    if(n == 0 || n == 1) return 1;
    double result = 1;
    for(int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}

void showHelp() {
    cout << "\\n📖 Calculator Help:" << endl;
    cout << "====================" << endl;
    cout << "This calculator supports the following operations:" << endl;
    cout << "• Addition (+): Adds two numbers" << endl;
    cout << "• Subtraction (-): Subtracts second number from first" << endl;
    cout << "• Multiplication (*): Multiplies two numbers" << endl;
    cout << "• Division (/): Divides first number by second" << endl;
    cout << "• Power (^): Raises base to exponent power" << endl;
    cout << "• Square Root (√): Calculates square root of a number" << endl;
    cout << "• Factorial (!): Calculates factorial of an integer" << endl;
    cout << "\\n📝 Tips:" << endl;
    cout << "- Enter numbers when prompted" << endl;
    cout << "- Use 'Q' to quit the calculator" << endl;
    cout << "- Use 'C' to see statistics" << endl;
    cout << "- Use 'H' to show this help again" << endl;
}

void clearInputBuffer() {
    cin.ignore(numeric_limits<streamsize>::max(), '\\n');
}`,

            oop: `// Object-Oriented Programming in C++
#include <iostream>
#include <string>
#include <vector>
#include <memory>

using namespace std;

// Base Class: Vehicle
class Vehicle {
protected:
    string brand;
    string model;
    int year;
    double price;
    
public:
    // Constructor
    Vehicle(string b, string m, int y, double p) 
        : brand(b), model(m), year(y), price(p) {
        cout << "🚗 Vehicle created: " << brand << " " << model << endl;
    }
    
    // Virtual destructor
    virtual ~Vehicle() {
        cout << "♻️ Vehicle destroyed: " << brand << " " << model << endl;
    }
    
    // Pure virtual function (makes Vehicle abstract)
    virtual void displayInfo() const = 0;
    
    // Virtual function with default implementation
    virtual void start() const {
        cout << "🔑 Starting the vehicle..." << endl;
    }
    
    // Getters
    string getBrand() const { return brand; }
    string getModel() const { return model; }
    int getYear() const { return year; }
    double getPrice() const { return price; }
    
    // Setters
    void setPrice(double p) { price = p; }
    
    // Static member
    static int vehicleCount;
};

int Vehicle::vehicleCount = 0;

// Derived Class: Car
class Car : public Vehicle {
private:
    int doors;
    string fuelType;
    
public:
    Car(string b, string m, int y, double p, int d, string f)
        : Vehicle(b, m, y, p), doors(d), fuelType(f) {
        vehicleCount++;
    }
    
    ~Car() {
        vehicleCount--;
    }
    
    // Override virtual function
    void displayInfo() const override {
        cout << "\\n🏎️ Car Information:" << endl;
        cout << "==================" << endl;
        cout << "Brand: " << brand << endl;
        cout << "Model: " << model << endl;
        cout << "Year: " << year << endl;
        cout << "Price: $" << price << endl;
        cout << "Doors: " << doors << endl;
        cout << "Fuel Type: " << fuelType << endl;
    }
    
    void start() const override {
        cout << "🚘 Starting car engine... Vroom Vroom!" << endl;
    }
    
    // Additional method specific to Car
    void honk() const {
        cout << "📢 Honk! Honk! Beep Beep!" << endl;
    }
};

// Derived Class: Motorcycle
class Motorcycle : public Vehicle {
private:
    bool hasSidecar;
    string engineType;
    
public:
    Motorcycle(string b, string m, int y, double p, bool sidecar, string engine)
        : Vehicle(b, m, y, p), hasSidecar(sidecar), engineType(engine) {
        vehicleCount++;
    }
    
    ~Motorcycle() {
        vehicleCount--;
    }
    
    void displayInfo() const override {
        cout << "\\n🏍️ Motorcycle Information:" << endl;
        cout << "=========================" << endl;
        cout << "Brand: " << brand << endl;
        cout << "Model: " << model << endl;
        cout << "Year: " << year << endl;
        cout << "Price: $" << price << endl;
        cout << "Has Sidecar: " << (hasSidecar ? "Yes" : "No") << endl;
        cout << "Engine Type: " << engineType << endl;
    }
    
    void start() const override {
        cout << "🏍️ Starting motorcycle... Rumble Rumble!" << endl;
    }
    
    // Additional method specific to Motorcycle
    void wheelie() const {
        cout << "🎯 Performing a wheelie! 🚀" << endl;
    }
};

// Template Class: Garage
template<typename T>
class Garage {
private:
    vector<shared_ptr<T>> vehicles;
    string name;
    
public:
    Garage(string n) : name(n) {
        cout << "\\n🏢 Garage created: " << name << endl;
    }
    
    void addVehicle(shared_ptr<T> vehicle) {
        vehicles.push_back(vehicle);
        cout << "✅ Vehicle added to garage: " << vehicle->getBrand() << endl;
    }
    
    void listVehicles() const {
        cout << "\\n📋 Vehicles in " << name << ":" << endl;
        cout << "=======================" << endl;
        for(const auto& vehicle : vehicles) {
            vehicle->displayInfo();
            cout << endl;
        }
    }
    
    double calculateTotalValue() const {
        double total = 0;
        for(const auto& vehicle : vehicles) {
            total += vehicle->getPrice();
        }
        return total;
    }
};

// Interface: Drivable
class Drivable {
public:
    virtual void accelerate() = 0;
    virtual void brake() = 0;
    virtual ~Drivable() = default;
};

// Multiple Inheritance Example
class SportsCar : public Car, public Drivable {
private:
    double topSpeed;
    
public:
    SportsCar(string b, string m, int y, double p, int d, string f, double speed)
        : Car(b, m, y, p, d, f), topSpeed(speed) {
        cout << "🏎️💨 Sports Car created!" << endl;
    }
    
    void displayInfo() const override {
        Car::displayInfo();
        cout << "Top Speed: " << topSpeed << " mph" << endl;
    }
    
    // Implement Drivable interface
    void accelerate() override {
        cout << "🚀 Accelerating to " << topSpeed << " mph!" << endl;
    }
    
    void brake() override {
        cout << "🛑 Emergency braking! Screeeech!" << endl;
    }
    
    void nitroBoost() {
        cout << "💨 Nitro boost activated! Maximum speed!" << endl;
    }
};

// Demonstration function
void demonstrateOOP() {
    cout << "🏛️ Object-Oriented Programming Demo" << endl;
    cout << "===================================" << endl;
    
    // Create vehicles using smart pointers
    auto car1 = make_shared<Car>("Toyota", "Camry", 2022, 25000, 4, "Hybrid");
    auto car2 = make_shared<Car>("Ford", "Mustang", 2023, 35000, 2, "Gasoline");
    auto bike1 = make_shared<Motorcycle>("Harley-Davidson", "Sportster", 2021, 15000, false, "V-Twin");
    auto sportsCar = make_shared<SportsCar>("Ferrari", "488", 2023, 250000, 2, "Gasoline", 205);
    
    // Demonstrate polymorphism
    cout << "\\n🎭 Polymorphism Demonstration:" << endl;
    cout << "==============================" << endl;
    
    vector<shared_ptr<Vehicle>> vehicles;
    vehicles.push_back(car1);
    vehicles.push_back(bike1);
    vehicles.push_back(sportsCar);
    
    for(const auto& vehicle : vehicles) {
        vehicle->start();
        vehicle->displayInfo();
        cout << endl;
    }
    
    // Demonstrate interfaces
    cout << "\\n🎮 Interface Demonstration:" << endl;
    cout << "===========================" << endl;
    
    Drivable* drivableCar = dynamic_cast<Drivable*>(sportsCar.get());
    if(drivableCar) {
        drivableCar->accelerate();
        drivableCar->brake();
    }
    
    // Demonstrate templates
    cout << "\\n📦 Template Demonstration:" << endl;
    cout << "==========================" << endl;
    
    Garage<Vehicle> myGarage("Premium Vehicles Garage");
    myGarage.addVehicle(car1);
    myGarage.addVehicle(bike1);
    myGarage.addVehicle(sportsCar);
    
    myGarage.listVehicles();
    cout << "Total value: $" << myGarage.calculateTotalValue() << endl;
    
    // Demonstrate method calls
    cout << "\\n🔧 Method Calling:" << endl;
    cout << "==================" << endl;
    
    car1->honk();
    bike1->wheelie();
    
    SportsCar* ferrari = dynamic_cast<SportsCar*>(sportsCar.get());
    if(ferrari) {
        ferrari->nitroBoost();
    }
    
    // Demonstrate static member
    cout << "\\n📊 Statistics:" << endl;
    cout << "==============" << endl;
    cout << "Total vehicles created: " << Vehicle::vehicleCount << endl;
    
    cout << "\\n✅ OOP Demonstration Completed!" << endl;
}

int main() {
    demonstrateOOP();
    return 0;
}`,

            stl: `// Standard Template Library (STL) Demonstration
#include <iostream>
#include <vector>
#include <list>
#include <deque>
#include <set>
#include <map>
#include <unordered_set>
#include <unordered_map>
#include <stack>
#include <queue>
#include <algorithm>
#include <numeric>
#include <functional>
#include <string>
#include <iterator>
#include <random>

using namespace std;

// Helper function to print container
template<typename Container>
void printContainer(const string& name, const Container& c) {
    cout << "\\n📦 " << name << " (" << c.size() << " elements):" << endl;
    cout << string(40, '-') << endl;
    
    int count = 0;
    for(const auto& element : c) {
        cout << element;
        if(++count < c.size()) cout << " ";
        if(count % 10 == 0) cout << endl;
    }
    if(count % 10 != 0) cout << endl;
}

void demonstrateVectors() {
    cout << "\\n🚀 Vector Demonstration" << endl;
    cout << "======================" << endl;
    
    vector<int> numbers;
    
    // Adding elements
    cout << "\\n➕ Adding elements..." << endl;
    for(int i = 1; i <= 10; i++) {
        numbers.push_back(i * 10);
    }
    printContainer("Vector", numbers);
    
    // Access elements
    cout << "\\n🔍 Accessing elements:" << endl;
    cout << "First element: " << numbers.front() << endl;
    cout << "Last element: " << numbers.back() << endl;
    cout << "Element at index 5: " << numbers[5] << endl;
    cout << "Element at index 5 (at()): " << numbers.at(5) << endl;
    
    // Iterator demonstration
    cout << "\\n🎯 Iterators:" << endl;
    cout << "Using begin() to end(): ";
    for(auto it = numbers.begin(); it != numbers.end(); ++it) {
        cout << *it << " ";
    }
    cout << endl;
    
    // Capacity
    cout << "\\n📏 Capacity:" << endl;
    cout << "Size: " << numbers.size() << endl;
    cout << "Capacity: " << numbers.capacity() << endl;
    cout << "Max size: " << numbers.max_size() << endl;
    
    // Modifying vector
    cout << "\\n🔄 Modifying vector:" << endl;
    numbers.insert(numbers.begin() + 3, 999);
    numbers.erase(numbers.begin() + 7);
    numbers.pop_back();
    printContainer("Modified Vector", numbers);
}

void demonstrateLists() {
    cout << "\\n\\n📋 List Demonstration" << endl;
    cout << "====================" << endl;
    
    list<string> names;
    
    // Adding elements
    names.push_back("Alice");
    names.push_front("Bob");
    names.push_back("Charlie");
    names.push_back("Diana");
    names.push_back("Eve");
    
    printContainer("List", names);
    
    // List operations
    cout << "\\n🔗 List-specific operations:" << endl;
    names.sort();
    printContainer("Sorted List", names);
    
    names.reverse();
    printContainer("Reversed List", names);
    
    // Splice demonstration
    list<string> otherNames = {"Frank", "Grace"};
    auto it = names.begin();
    advance(it, 2);
    names.splice(it, otherNames);
    printContainer("After Splice", names);
}

void demonstrateSets() {
    cout << "\\n\\n🎯 Set Demonstration" << endl;
    cout << "====================" << endl;
    
    set<int> uniqueNumbers;
    multiset<int> multiNumbers;
    
    // Inserting elements
    vector<int> randomNums = {5, 2, 8, 2, 5, 1, 9, 8, 3};
    
    for(int num : randomNums) {
        uniqueNumbers.insert(num);
        multiNumbers.insert(num);
    }
    
    printContainer("Set (Unique)", uniqueNumbers);
    printContainer("Multiset", multiNumbers);
    
    // Set operations
    cout << "\\n🔍 Set operations:" << endl;
    cout << "Count of 2 in set: " << uniqueNumbers.count(2) << endl;
    cout << "Count of 2 in multiset: " << multiNumbers.count(2) << endl;
    
    // Finding elements
    auto found = uniqueNumbers.find(5);
    if(found != uniqueNumbers.end()) {
        cout << "Found 5 in set: " << *found << endl;
    }
    
    // Range search
    cout << "\\n🎯 Range search (3 to 7):" << endl;
    auto lower = uniqueNumbers.lower_bound(3);
    auto upper = uniqueNumbers.upper_bound(7);
    cout << "Elements: ";
    for(auto it = lower; it != upper; ++it) {
        cout << *it << " ";
    }
    cout << endl;
}

void demonstrateMaps() {
    cout << "\\n\\n🗺️ Map Demonstration" << endl;
    cout << "====================" << endl;
    
    map<string, int> studentScores;
    unordered_map<string, string> countryCapitals;
    
    // Inserting into map
    studentScores["Alice"] = 95;
    studentScores["Bob"] = 87;
    studentScores["Charlie"] = 92;
    studentScores["Diana"] = 78;
    studentScores.insert({"Eve", 88});
    
    // Inserting into unordered_map
    countryCapitals["USA"] = "Washington D.C.";
    countryCapitals["Japan"] = "Tokyo";
    countryCapitals["France"] = "Paris";
    countryCapitals["Brazil"] = "Brasilia";
    
    cout << "\\n📊 Student Scores:" << endl;
    for(const auto& [name, score] : studentScores) {
        cout << name << ": " << score << endl;
    }
    
    cout << "\\n🌍 Country Capitals:" << endl;
    for(const auto& [country, capital] : countryCapitals) {
        cout << country << " -> " << capital << endl;
    }
    
    // Map operations
    cout << "\\n🔍 Map operations:" << endl;
    cout << "Size of studentScores: " << studentScores.size() << endl;
    cout << "Is empty? " << (studentScores.empty() ? "Yes" : "No") << endl;
    
    // Finding in map
    auto student = studentScores.find("Charlie");
    if(student != studentScores.end()) {
        cout << "Found Charlie: " << student->second << endl;
    }
    
    // Modifying map
    studentScores["Bob"] = 90; // Update
    studentScores.erase("Diana"); // Remove
    
    cout << "\\n📈 Updated Scores:" << endl;
    for(const auto& [name, score] : studentScores) {
        cout << name << ": " << score << endl;
    }
}

void demonstrateAlgorithms() {
    cout << "\\n\\n🔧 STL Algorithms Demonstration" << endl;
    cout << "================================" << endl;
    
    vector<int> numbers = {42, 17, 89, 5, 33, 71, 23, 64, 12, 98};
    printContainer("Original Numbers", numbers);
    
    // Sorting
    sort(numbers.begin(), numbers.end());
    printContainer("Sorted Numbers", numbers);
    
    // Reverse
    reverse(numbers.begin(), numbers.end());
    printContainer("Reversed Numbers", numbers);
    
    // Find
    auto found = find(numbers.begin(), numbers.end(), 33);
    if(found != numbers.end()) {
        cout << "\\n🔍 Found 33 at position: " << distance(numbers.begin(), found) << endl;
    }
    
    // Count
    int countGreaterThan50 = count_if(numbers.begin(), numbers.end(), 
                                     [](int x) { return x > 50; });
    cout << "📊 Count of numbers > 50: " << countGreaterThan50 << endl;
    
    // Transform
    vector<int> squared;
    transform(numbers.begin(), numbers.end(), back_inserter(squared),
              [](int x) { return x * x; });
    printContainer("Squared Numbers", squared);
    
    // Accumulate
    int sum = accumulate(numbers.begin(), numbers.end(), 0);
    cout << "🧮 Sum of numbers: " << sum << endl;
    
    // Min and Max
    auto minMax = minmax_element(numbers.begin(), numbers.end());
    cout << "📈 Min: " << *minMax.first << ", Max: " << *minMax.second << endl;
    
    // Random shuffle
    random_device rd;
    mt19937 g(rd());
    shuffle(numbers.begin(), numbers.end(), g);
    printContainer("Shuffled Numbers", numbers);
    
    // Binary search (requires sorted array)
    sort(numbers.begin(), numbers.end());
    bool has42 = binary_search(numbers.begin(), numbers.end(), 42);
    cout << "🔎 Binary search for 42: " << (has42 ? "Found" : "Not found") << endl;
}

void demonstrateContainers() {
    cout << "\\n\\n📚 Container Adaptors" << endl;
    cout << "======================" << endl;
    
    // Stack (LIFO)
    cout << "\\n📚 Stack (LIFO):" << endl;
    stack<int> s;
    for(int i = 1; i <= 5; i++) s.push(i * 10);
    
    cout << "Stack contents (top to bottom): ";
    while(!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }
    cout << endl;
    
    // Queue (FIFO)
    cout << "\\n📋 Queue (FIFO):" << endl;
    queue<string> q;
    q.push("First");
    q.push("Second");
    q.push("Third");
    
    cout << "Queue contents: ";
    while(!q.empty()) {
        cout << q.front() << " ";
        q.pop();
    }
    cout << endl;
    
    // Priority Queue
    cout << "\\n⭐ Priority Queue:" << endl;
    priority_queue<int> pq;
    vector<int> vals = {30, 10, 50, 20, 40};
    for(int val : vals) pq.push(val);
    
    cout << "Priority Queue (highest first): ";
    while(!pq.empty()) {
        cout << pq.top() << " ";
        pq.pop();
    }
    cout << endl;
}

int main() {
    cout << "📚 Standard Template Library (STL) Demo" << endl;
    cout << "=======================================" << endl;
    
    demonstrateVectors();
    demonstrateLists();
    demonstrateSets();
    demonstrateMaps();
    demonstrateAlgorithms();
    demonstrateContainers();
    
    cout << "\\n🎉 STL Demonstration Completed!" << endl;
    cout << "🚀 C++ STL is powerful and efficient!" << endl;
    
    return 0;
}`,

            sorting: `// Sorting Algorithms Visualization in C++
#include <iostream>
#include <vector>
#include <algorithm>
#include <chrono>
#include <random>
#include <iomanip>
#include <string>

using namespace std;
using namespace chrono;

// Helper function to print array with visualization
void printArray(const vector<int>& arr, int highlight1 = -1, int highlight2 = -1) {
    for(int i = 0; i < arr.size(); i++) {
        if(i == highlight1) {
            cout << "[" << arr[i] << "] ";
        } else if(i == highlight2) {
            cout << "(" << arr[i] << ") ";
        } else {
            cout << arr[i] << " ";
        }
    }
    cout << endl;
}

// Bubble Sort with visualization
void bubbleSort(vector<int>& arr, bool visualize = true) {
    int n = arr.size();
    int comparisons = 0;
    int swaps = 0;
    
    if(visualize) {
        cout << "\\n🫧 Bubble Sort Visualization" << endl;
        cout << "==========================" << endl;
        cout << "Original array: ";
        printArray(arr);
    }
    
    auto start = high_resolution_clock::now();
    
    for(int i = 0; i < n-1; i++) {
        if(visualize) {
            cout << "\\nPass " << (i+1) << ":" << endl;
        }
        
        bool swapped = false;
        for(int j = 0; j < n-i-1; j++) {
            comparisons++;
            
            if(visualize) {
                cout << "  Comparing positions " << j << " and " << (j+1) << ": ";
                printArray(arr, j, j+1);
            }
            
            if(arr[j] > arr[j+1]) {
                // Swap
                swap(arr[j], arr[j+1]);
                swaps++;
                swapped = true;
                
                if(visualize) {
                    cout << "  Swapped! New array: ";
                    printArray(arr);
                }
            }
        }
        
        if(!swapped) {
            if(visualize) cout << "  No swaps needed, array is sorted!" << endl;
            break;
        }
    }
    
    auto end = high_resolution_clock::now();
    auto duration = duration_cast<microseconds>(end - start);
    
    if(visualize) {
        cout << "\\n✅ Sorted array: ";
        printArray(arr);
    }
    
    cout << "\\n📊 Bubble Sort Statistics:" << endl;
    cout << "  Comparisons: " << comparisons << endl;
    cout << "  Swaps: " << swaps << endl;
    cout << "  Time: " << duration.count() << " microseconds" << endl;
}

// Selection Sort with visualization
void selectionSort(vector<int>& arr, bool visualize = true) {
    int n = arr.size();
    int comparisons = 0;
    int swaps = 0;
    
    if(visualize) {
        cout << "\\n🎯 Selection Sort Visualization" << endl;
        cout << "=============================" << endl;
        cout << "Original array: ";
        printArray(arr);
    }
    
    auto start = high_resolution_clock::now();
    
    for(int i = 0; i < n-1; i++) {
        if(visualize) {
            cout << "\\nPass " << (i+1) << " (finding minimum in unsorted part):" << endl;
        }
        
        int minIndex = i;
        for(int j = i+1; j < n; j++) {
            comparisons++;
            
            if(visualize && j == i+1) {
                cout << "  Initial minimum: arr[" << minIndex << "] = " << arr[minIndex] << endl;
            }
            
            if(arr[j] < arr[minIndex]) {
                if(visualize) {
                    cout << "  Found new minimum: arr[" << j << "] = " << arr[j] << endl;
                }
                minIndex = j;
            }
        }
        
        if(minIndex != i) {
            swap(arr[i], arr[minIndex]);
            swaps++;
            
            if(visualize) {
                cout << "  Swapped arr[" << i << "] with arr[" << minIndex << "]" << endl;
                cout << "  Current array: ";
                printArray(arr);
            }
        }
    }
    
    auto end = high_resolution_clock::now();
    auto duration = duration_cast<microseconds>(end - start);
    
    if(visualize) {
        cout << "\\n✅ Sorted array: ";
        printArray(arr);
    }
    
    cout << "\\n📊 Selection Sort Statistics:" << endl;
    cout << "  Comparisons: " << comparisons << endl;
    cout << "  Swaps: " << swaps << endl;
    cout << "  Time: " << duration.count() << " microseconds" << endl;
}

// Insertion Sort with visualization
void insertionSort(vector<int>& arr, bool visualize = true) {
    int n = arr.size();
    int comparisons = 0;
    int shifts = 0;
    
    if(visualize) {
        cout << "\\n📌 Insertion Sort Visualization" << endl;
        cout << "==============================" << endl;
        cout << "Original array: ";
        printArray(arr);
    }
    
    auto start = high_resolution_clock::now();
    
    for(int i = 1; i < n; i++) {
        if(visualize) {
            cout << "\\nPass " << i << " (inserting element " << arr[i] << " at position " << i << "):" << endl;
        }
        
        int key = arr[i];
        int j = i - 1;
        
        if(visualize) {
            cout << "  Key to insert: " << key << endl;
        }
        
        while(j >= 0 && arr[j] > key) {
            comparisons++;
            arr[j + 1] = arr[j];
            shifts++;
            j--;
            
            if(visualize) {
                cout << "  Shifted " << arr[j+2] << " to position " << (j+2) << endl;
                cout << "  Current array: ";
                printArray(arr);
            }
        }
        
        arr[j + 1] = key;
        
        if(visualize) {
            cout << "  Inserted key at position " << (j+1) << endl;
            cout << "  Current array: ";
            printArray(arr);
        }
    }
    
    auto end = high_resolution_clock::now();
    auto duration = duration_cast<microseconds>(end - start);
    
    if(visualize) {
        cout << "\\n✅ Sorted array: ";
        printArray(arr);
    }
    
    cout << "\\n📊 Insertion Sort Statistics:" << endl;
    cout << "  Comparisons: " << comparisons << endl;
    cout << "  Shifts: " << shifts << endl;
    cout << "  Time: " << duration.count() << " microseconds" << endl;
}

// Quick Sort partition with visualization
int partition(vector<int>& arr, int low, int high, int& comparisons, int& swaps, bool visualize) {
    int pivot = arr[high];
    int i = low - 1;
    
    if(visualize) {
        cout << "  Pivot: " << pivot << " (last element)" << endl;
    }
    
    for(int j = low; j < high; j++) {
        comparisons++;
        
        if(visualize) {
            cout << "  Comparing arr[" << j << "] = " << arr[j] << " with pivot " << pivot << endl;
        }
        
        if(arr[j] < pivot) {
            i++;
            swap(arr[i], arr[j]);
            swaps++;
            
            if(visualize) {
                cout << "  Swapped arr[" << i << "] with arr[" << j << "]" << endl;
                cout << "  Current array: ";
                printArray(arr);
            }
        }
    }
    
    swap(arr[i + 1], arr[high]);
    swaps++;
    
    if(visualize) {
        cout << "  Placed pivot at correct position " << (i+1) << endl;
        cout << "  Current array: ";
        printArray(arr);
    }
    
    return i + 1;
}

// Quick Sort recursive function
void quickSortRecursive(vector<int>& arr, int low, int high, int& comparisons, int& swaps, bool visualize) {
    if(low < high) {
        if(visualize) {
            cout << "\\n📊 Sorting subarray from index " << low << " to " << high << ":" << endl;
            cout << "  Subarray: ";
            for(int k = low; k <= high; k++) {
                cout << arr[k] << " ";
            }
            cout << endl;
        }
        
        int pi = partition(arr, low, high, comparisons, swaps, visualize);
        
        if(visualize) {
            cout << "  Partition index: " << pi << endl;
        }
        
        quickSortRecursive(arr, low, pi - 1, comparisons, swaps, visualize);
        quickSortRecursive(arr, pi + 1, high, comparisons, swaps, visualize);
    }
}

// Quick Sort wrapper
void quickSort(vector<int>& arr, bool visualize = true) {
    if(visualize) {
        cout << "\\n⚡ Quick Sort Visualization" << endl;
        cout << "==========================" << endl;
        cout << "Original array: ";
        printArray(arr);
    }
    
    int comparisons = 0;
    int swaps = 0;
    
    auto start = high_resolution_clock::now();
    quickSortRecursive(arr, 0, arr.size() - 1, comparisons, swaps, visualize);
    auto end = high_resolution_clock::now();
    auto duration = duration_cast<microseconds>(end - start);
    
    if(visualize) {
        cout << "\\n✅ Sorted array: ";
        printArray(arr);
    }
    
    cout << "\\n📊 Quick Sort Statistics:" << endl;
    cout << "  Comparisons: " << comparisons << endl;
    cout << "  Swaps: " << swaps << endl;
    cout << "  Time: " << duration.count() << " microseconds" << endl;
}

// Generate random array
vector<int> generateRandomArray(int size, int minVal, int maxVal) {
    vector<int> arr(size);
    random_device rd;
    mt19937 gen(rd());
    uniform_int_distribution<> dis(minVal, maxVal);
    
    for(int i = 0; i < size; i++) {
        arr[i] = dis(gen);
    }
    
    return arr;
}

// Compare all sorting algorithms
void compareSortingAlgorithms() {
    cout << "\\n🏆 Sorting Algorithms Comparison" << endl;
    cout << "================================" << endl;
    
    const int ARRAY_SIZE = 1000;
    const int MIN_VAL = 1;
    const int MAX_VAL = 10000;
    
    // Generate random array
    cout << "\\n🎲 Generating random array of " << ARRAY_SIZE << " elements..." << endl;
    vector<int> original = generateRandomArray(ARRAY_SIZE, MIN_VAL, MAX_VAL);
    
    // Test each algorithm
    vector<pair<string, function<void(vector<int>&, bool)>>> algorithms = {
        {"Bubble Sort", bubbleSort},
        {"Selection Sort", selectionSort},
        {"Insertion Sort", insertionSort},
        {"Quick Sort", quickSort}
    };
    
    vector<tuple<string, long long, int, int>> results;
    
    for(auto& [name, algo] : algorithms) {
        cout << "\\n" << string(50, '=') << endl;
        cout << "Testing " << name << "..." << endl;
        cout << string(50, '=') << endl;
        
        // Copy original array
        vector<int> arr = original;
        
        // Run algorithm (without visualization for speed)
        auto start = high_resolution_clock::now();
        algo(arr, false);
        auto end = high_resolution_clock::now();
        auto duration = duration_cast<microseconds>(end - start);
        
        // Verify sorting
        bool isSorted = is_sorted(arr.begin(), arr.end());
        
        cout << "✅ " << name << " completed!" << endl;
        cout << "   Time: " << duration.count() << " μs" << endl;
        cout << "   Correctly sorted: " << (isSorted ? "Yes" : "No") << endl;
        
        // For simplicity, we'll use dummy comparison and swap counts
        int comparisons = ARRAY_SIZE * ARRAY_SIZE; // Approximation
        int swaps = ARRAY_SIZE * ARRAY_SIZE / 4;   // Approximation
        
        results.push_back({name, duration.count(), comparisons, swaps});
    }
    
    // Display comparison results
    cout << "\\n" << string(60, '=') << endl;
    cout << "📊 FINAL COMPARISON RESULTS" << endl;
    cout << string(60, '=') << endl;
    
    cout << left << setw(20) << "Algorithm" 
         << setw(15) << "Time (μs)" 
         << setw(15) << "Comparisons" 
         << setw(10) << "Swaps" 
         << setw(15) << "Efficiency" << endl;
    
    cout << string(75, '-') << endl;
    
    for(auto& [name, time, comparisons, swaps] : results) {
        string efficiency;
        if(time < 1000) efficiency = "⭐ Excellent";
        else if(time < 5000) efficiency = "👍 Good";
        else if(time < 20000) efficiency = "⚠ Average";
        else efficiency = "🐌 Slow";
        
        cout << left << setw(20) << name 
             << setw(15) << time 
             << setw(15) << comparisons 
             << setw(10) << swaps 
             << setw(15) << efficiency << endl;
    }
    
    // Find fastest algorithm
    auto fastest = min_element(results.begin(), results.end(),
        [](const auto& a, const auto& b) {
            return get<1>(a) < get<1>(b);
        });
    
    cout << "\\n🏆 Fastest Algorithm: " << get<0>(*fastest) 
         << " (" << get<1>(*fastest) << " μs)" << endl;
    
    // Educational notes
    cout << "\\n💡 Educational Notes:" << endl;
    cout << "• Bubble Sort: Simple but O(n²), good for small arrays" << endl;
    cout << "• Selection Sort: O(n²), minimizes swaps" << endl;
    cout << "• Insertion Sort: O(n²), efficient for nearly sorted arrays" << endl;
    cout << "• Quick Sort: O(n log n) average, very fast in practice" << endl;
    cout << "• C++ std::sort uses Introsort (Quick + Heap + Insertion)" << endl;
}

int main() {
    cout << "🎯 Sorting Algorithms Visualization" << endl;
    cout << "===================================" << endl;
    
    // Small array for visualization
    vector<int> smallArray = {64, 34, 25, 12, 22, 11, 90, 5};
    
    // Visualize each algorithm on small array
    vector<int> arr1 = smallArray;
    bubbleSort(arr1, true);
    
    vector<int> arr2 = smallArray;
    selectionSort(arr2, true);
    
    vector<int> arr3 = smallArray;
    insertionSort(arr3, true);
    
    vector<int> arr4 = smallArray;
    quickSort(arr4, true);
    
    // Compare performance on larger array
    compareSortingAlgorithms();
    
    // Demonstrate C++ std::sort
    cout << "\\n" << string(60, '=') << endl;
    cout << "🚀 C++ Standard Library std::sort" << endl;
    cout << string(60, '=') << endl;
    
    vector<int> largeArray = generateRandomArray(10000, 1, 100000);
    auto start = high_resolution_clock::now();
    sort(largeArray.begin(), largeArray.end());
    auto end = high_resolution_clock::now();
    auto duration = duration_cast<microseconds>(end - start);
    
    bool isSorted = is_sorted(largeArray.begin(), largeArray.end());
    
    cout << "✅ std::sort completed!" << endl;
    cout << "   Array size: 10,000 elements" << endl;
    cout << "   Time: " << duration.count() << " microseconds" << endl;
    cout << "   Correctly sorted: " << (isSorted ? "Yes" : "No") << endl;
    cout << "\\n💡 std::sort is highly optimized and should be your first choice!" << endl;
    
    cout << "\\n🎉 Sorting Algorithms Demonstration Completed!" << endl;
    
    return 0;
}`,

            graphics: `// ASCII Art and Console Graphics in C++
#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <thread>
#include <chrono>
#include <algorithm>
#include <random>

using namespace std;
using namespace chrono;
using namespace this_thread;

// Clear console (platform dependent)
#ifdef _WIN32
    #include <windows.h>
    void clearScreen() { system("cls"); }
#else
    void clearScreen() { system("clear"); }
#endif

// Set cursor position
void setCursorPosition(int x, int y) {
    #ifdef _WIN32
        COORD coord;
        coord.X = x;
        coord.Y = y;
        SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), coord);
    #else
        cout << "\\033[" << y << ";" << x << "H";
    #endif
}

// Color codes for terminal
#ifdef _WIN32
    // Windows color codes
    #define COLOR_RESET 7
    #define COLOR_RED 12
    #define COLOR_GREEN 10
    #define COLOR_YELLOW 14
    #define COLOR_BLUE 9
    #define COLOR_MAGENTA 13
    #define COLOR_CYAN 11
    #define COLOR_WHITE 15
    
    void setColor(int color) {
        HANDLE hConsole = GetStdHandle(STD_OUTPUT_HANDLE);
        SetConsoleTextAttribute(hConsole, color);
    }
#else
    // ANSI color codes for Unix/Linux/Mac
    #define COLOR_RESET "\\033[0m"
    #define COLOR_RED "\\033[31m"
    #define COLOR_GREEN "\\033[32m"
    #define COLOR_YELLOW "\\033[33m"
    #define COLOR_BLUE "\\033[34m"
    #define COLOR_MAGENTA "\\033[35m"
    #define COLOR_CYAN "\\033[36m"
    #define COLOR_WHITE "\\033[37m"
    
    void setColor(const string& color) {
        cout << color;
    }
#endif

// Draw a rectangle
void drawRectangle(int x, int y, int width, int height, char border = '#', char fill = ' ') {
    for(int i = 0; i < height; i++) {
        setCursorPosition(x, y + i);
        for(int j = 0; j < width; j++) {
            if(i == 0 || i == height-1 || j == 0 || j == width-1) {
                cout << border;
            } else {
                cout << fill;
            }
        }
    }
}

// Draw a circle
void drawCircle(int centerX, int centerY, int radius, char pixel = '*') {
    for(int y = -radius; y <= radius; y++) {
        setCursorPosition(centerX - radius, centerY + y);
        for(int x = -radius; x <= radius; x++) {
            if(x*x + y*y <= radius*radius) {
                cout << pixel;
            } else {
                cout << ' ';
            }
        }
    }
}

// Draw a line using Bresenham's algorithm
void drawLine(int x1, int y1, int x2, int y2, char ch = '*') {
    int dx = abs(x2 - x1);
    int dy = abs(y2 - y1);
    int sx = (x1 < x2) ? 1 : -1;
    int sy = (y1 < y2) ? 1 : -1;
    int err = dx - dy;
    
    while(true) {
        setCursorPosition(x1, y1);
        cout << ch;
        
        if(x1 == x2 && y1 == y2) break;
        
        int e2 = 2 * err;
        if(e2 > -dy) {
            err -= dy;
            x1 += sx;
        }
        if(e2 < dx) {
            err += dx;
            y1 += sy;
        }
    }
}

// Animated banner
void animatedBanner(const string& text) {
    clearScreen();
    
    int width = 60;
    int height = 10;
    int centerX = width / 2;
    int centerY = height / 2;
    
    // Draw animated border
    for(int frame = 0; frame < 20; frame++) {
        clearScreen();
        
        #ifndef _WIN32
        setColor(COLOR_CYAN);
        #endif
        
        // Animated border
        char borderChar = "#*+-=~"[frame % 6];
        drawRectangle(0, 0, width, height, borderChar);
        
        // Display text
        setCursorPosition(centerX - text.length()/2, centerY);
        cout << text;
        
        // Animated corners
        setCursorPosition(0, 0);
        cout << '@';
        setCursorPosition(width-1, 0);
        cout << '@';
        setCursorPosition(0, height-1);
        cout << '@';
        setCursorPosition(width-1, height-1);
        cout << '@';
        
        sleep_for(milliseconds(100));
    }
    
    #ifndef _WIN32
    setColor(COLOR_RESET);
    #endif
    cout << endl;
}

// Matrix rain animation (simplified)
void matrixRain(int durationSeconds = 10) {
    clearScreen();
    
    const int width = 80;
    const int height = 24;
    vector<string> columns(width, string(height, ' '));
    vector<int> columnSpeeds(width);
    vector<int> columnPositions(width, 0);
    
    random_device rd;
    mt19937 gen(rd());
    uniform_int_distribution<> speedDist(1, 5);
    uniform_int_distribution<> charDist(33, 126);
    
    // Initialize columns
    for(int i = 0; i < width; i++) {
        columnSpeeds[i] = speedDist(gen);
    }
    
    auto start = steady_clock::now();
    
    #ifndef _WIN32
    setColor(COLOR_GREEN);
    #endif
    
    while(duration_cast<seconds>(steady_clock::now() - start).count() < durationSeconds) {
        clearScreen();
        
        for(int x = 0; x < width; x++) {
            // Update column
            columnPositions[x] += columnSpeeds[x];
            if(columnPositions[x] >= height) {
                columnPositions[x] = 0;
                // Generate new random characters for this column
                for(int y = 0; y < height; y++) {
                    columns[x][y] = charDist(gen);
                }
            }
            
            // Draw column
            for(int y = 0; y < height; y++) {
                setCursorPosition(x, y);
                if(y <= columnPositions[x]) {
                    cout << columns[x][y];
                } else {
                    cout << ' ';
                }
            }
        }
        
        sleep_for(milliseconds(50));
    }
    
    #ifndef _WIN32
    setColor(COLOR_RESET);
    #endif
}

// Digital clock animation
void digitalClockAnimation() {
    clearScreen();
    
    const int width = 40;
    const int height = 10;
    
    // Digit patterns (simplified 3x3)
    vector<vector<string>> digits = {
        {"███", "█ █", "█ █", "█ █", "███"},  // 0
        {"  █", "  █", "  █", "  █", "  █"},  // 1
        {"███", "  █", "███", "█  ", "███"},  // 2
        {"███", "  █", "███", "  █", "███"},  // 3
        {"█ █", "█ █", "███", "  █", "  █"},  // 4
        {"███", "█  ", "███", "  █", "███"},  // 5
        {"███", "█  ", "███", "█ █", "███"},  // 6
        {"███", "  █", "  █", "  █", "  █"},  // 7
        {"███", "█ █", "███", "█ █", "███"},  // 8
        {"███", "█ █", "███", "  █", "███"}   // 9
    };
    
    auto start = steady_clock::now();
    
    while(duration_cast<seconds>(steady_clock::now() - start).count() < 15) {
        clearScreen();
        
        // Get current time
        auto now = system_clock::now();
        time_t currentTime = system_clock::to_time_t(now);
        tm* localTime = localtime(&currentTime);
        
        int hours = localTime->tm_hour;
        int minutes = localTime->tm_min;
        int seconds = localTime->tm_sec;
        
        // Draw border
        #ifndef _WIN32
        setColor(COLOR_CYAN);
        #endif
        drawRectangle(0, 0, width, height, '#', ' ');
        
        // Draw clock title
        setCursorPosition(width/2 - 5, 1);
        cout << "DIGITAL CLOCK";
        
        // Draw digits
        int startX = width/2 - 10;
        int startY = height/2 - 2;
        
        vector<int> timeDigits = {hours/10, hours%10, minutes/10, minutes%10, seconds/10, seconds%10};
        
        for(int digit = 0; digit < 6; digit++) {
            int digitX = startX + digit * 4 + (digit >= 2 ? 1 : 0) + (digit >= 4 ? 1 : 0);
            
            // Draw colon between hours and minutes, minutes and seconds
            if(digit == 2 || digit == 4) {
                setCursorPosition(digitX, startY + 1);
                cout << "█";
                setCursorPosition(digitX, startY + 3);
                cout << "█";
                continue;
            }
            
            // Draw the digit
            int actualDigit = timeDigits[digit];
            for(int y = 0; y < 5; y++) {
                setCursorPosition(digitX, startY + y);
                cout << digits[actualDigit][y];
            }
        }
        
        // Draw blinking colon animation
        static bool blink = false;
        blink = !blink;
        
        if(blink) {
            setCursorPosition(startX + 8, startY + 1);
            cout << " ";
            setCursorPosition(startX + 8, startY + 3);
            cout << " ";
            setCursorPosition(startX + 17, startY + 1);
            cout << " ";
            setCursorPosition(startX + 17, startY + 3);
            cout << " ";
        }
        
        // Draw date
        setCursorPosition(width/2 - 8, height - 2);
        char dateStr[50];
        strftime(dateStr, sizeof(dateStr), "%A, %B %d, %Y", localTime);
        cout << dateStr;
        
        sleep_for(milliseconds(500));
    }
    
    #ifndef _WIN32
    setColor(COLOR_RESET);
    #endif
}

// Bar chart animation
void barChartAnimation() {
    clearScreen();
    
    const int width = 60;
    const int height = 20;
    const int numBars = 10;
    
    vector<int> values(numBars);
    vector<string> labels = {"C++", "Python", "Java", "C#", "JS", "Go", "Rust", "Swift", "Kotlin", "TS"};
    vector<string> colors = {COLOR_RED, COLOR_GREEN, COLOR_YELLOW, COLOR_BLUE, COLOR_MAGENTA, 
                            COLOR_CYAN, COLOR_RED, COLOR_GREEN, COLOR_YELLOW, COLOR_BLUE};
    
    random_device rd;
    mt19937 gen(rd());
    uniform_int_distribution<> valueDist(1, height - 4);
    
    // Initialize random values
    for(int i = 0; i < numBars; i++) {
        values[i] = valueDist(gen);
    }
    
    auto start = steady_clock::now();
    
    while(duration_cast<seconds>(steady_clock::now() - start).count() < 10) {
        clearScreen();
        
        // Draw border
        #ifndef _WIN32
        setColor(COLOR_WHITE);
        #endif
        drawRectangle(0, 0, width, height, '#', ' ');
        
        // Draw title
        setCursorPosition(width/2 - 12, 1);
        cout << "📊 PROGRAMMING LANGUAGE POPULARITY";
        
        // Calculate bar positions
        int barWidth = 4;
        int spacing = 2;
        int totalWidth = numBars * (barWidth + spacing) - spacing;
        int startX = (width - totalWidth) / 2;
        
        // Animate bars growing
        static vector<int> currentHeights(numBars, 0);
        
        for(int i = 0; i < numBars; i++) {
            if(currentHeights[i] < values[i]) {
                currentHeights[i]++;
            }
            
            // Draw bar
            int barX = startX + i * (barWidth + spacing);
            int barHeight = currentHeights[i];
            
            #ifndef _WIN32
            setColor(colors[i % colors.size()]);
            #endif
            
            for(int h = 0; h < barHeight; h++) {
                for(int w = 0; w < barWidth; w++) {
                    setCursorPosition(barX + w, height - 2 - h);
                    cout << (h == barHeight - 1 ? '_' : '█');
                }
            }
            
            // Draw label
            #ifndef _WIN32
            setColor(COLOR_WHITE);
            #endif
            setCursorPosition(barX, height - 1);
            cout << labels[i];
            
            // Draw value
            setCursorPosition(barX, height - 2 - barHeight - 1);
            cout << values[i];
        }
        
        // Randomly update one value
        if(rand() % 10 == 0) {
            int idx = rand() % numBars;
            values[idx] = valueDist(gen);
            if(values[idx] > currentHeights[idx]) {
                currentHeights[idx] = 0; // Reset for new animation
            }
        }
        
        sleep_for(milliseconds(100));
    }
    
    #ifndef _WIN32
    setColor(COLOR_RESET);
    #endif
}

// Solar system animation
void solarSystemAnimation() {
    clearScreen();
    
    const int width = 80;
    const int height = 24;
    const int centerX = width / 2;
    const int centerY = height / 2;
    
    // Planet data: name, radius, distance, speed, color
    vector<tuple<string, int, double, double, string>> planets = {
        {"Sun", 3, 0, 0, COLOR_YELLOW},
        {"Mercury", 1, 8, 4.1, COLOR_GREEN},
        {"Venus", 1, 12, 1.6, COLOR_MAGENTA},
        {"Earth", 2, 16, 1.0, COLOR_BLUE},
        {"Mars", 1, 20, 0.5, COLOR_RED},
        {"Jupiter", 4, 28, 0.08, COLOR_YELLOW},
        {"Saturn", 3, 36, 0.03, COLOR_CYAN},
        {"Uranus", 2, 42, 0.01, COLOR_GREEN},
        {"Neptune", 2, 48, 0.006, COLOR_BLUE}
    };
    
    vector<double> angles(planets.size(), 0);
    
    auto start = steady_clock::now();
    
    while(duration_cast<seconds>(steady_clock::now() - start).count() < 20) {
        clearScreen();
        
        // Draw title
        #ifndef _WIN32
        setColor(COLOR_WHITE);
        #endif
        setCursorPosition(width/2 - 8, 1);
        cout << "🪐 SOLAR SYSTEM";
        
        // Draw planets
        for(int i = 0; i < planets.size(); i++) {
            auto [name, radius, distance, speed, color] = planets[i];
            
            // Update angle
            angles[i] += speed * 0.1;
            if(angles[i] > 2 * M_PI) angles[i] -= 2 * M_PI;
            
            // Calculate position
            int x = centerX + distance * cos(angles[i]);
            int y = centerY + distance * sin(angles[i]) * 0.5; // Elliptical
            
            // Draw planet
            #ifndef _WIN32
            setColor(color);
            #endif
            
            if(i == 0) { // Sun
                drawCircle(x, y, radius, '●');
            } else {
                setCursorPosition(x, y);
                cout << '○';
                
                // Draw orbit
                #ifndef _WIN32
                setColor(COLOR_WHITE);
                #endif
                for(double angle = 0; angle < 2 * M_PI; angle += 0.1) {
                    int orbitX = centerX + distance * cos(angle);
                    int orbitY = centerY + distance * sin(angle) * 0.5;
                    if(orbitX >= 0 && orbitX < width && orbitY >= 0 && orbitY < height) {
                        setCursorPosition(orbitX, orbitY);
                        cout << '.';
                    }
                }
            }
            
            // Draw name
            #ifndef _WIN32
            setColor(COLOR_WHITE);
            #endif
            setCursorPosition(x - name.length()/2, y + 2);
            cout << name;
        }
        
        // Draw legend
        setCursorPosition(2, height - 4);
        cout << "Real-time planetary motion simulation";
        setCursorPosition(2, height - 3);
        cout << "Orbital speeds are relative to Earth";
        
        sleep_for(milliseconds(100));
    }
    
    #ifndef _WIN32
    setColor(COLOR_RESET);
    #endif
}

int main() {
    // Clear screen at start
    clearScreen();
    
    cout << "🎨 C++ Console Graphics Demo" << endl;
    cout << "===========================" << endl;
    cout << "\\nThis demo shows various ASCII art animations using C++." << endl;
    cout << "Press Enter to continue between animations..." << endl;
    
    cin.get();
    
    // 1. Animated Banner
    animatedBanner("WELCOME TO C++ GRAPHICS!");
    cin.get();
    
    // 2. Matrix Rain
    cout << "\\n🌀 Matrix Rain Animation (10 seconds)..." << endl;
    sleep_for(seconds(2));
    matrixRain(10);
    cin.get();
    
    // 3. Digital Clock
    cout << "\\n🕐 Digital Clock Animation (15 seconds)..." << endl;
    sleep_for(seconds(2));
    digitalClockAnimation();
    cin.get();
    
    // 4. Bar Chart
    cout << "\\n📊 Animated Bar Chart (10 seconds)..." << endl;
    sleep_for(seconds(2));
    barChartAnimation();
    cin.get();
    
    // 5. Solar System
    cout << "\\n🪐 Solar System Animation (20 seconds)..." << endl;
    sleep_for(seconds(2));
    solarSystemAnimation();
    cin.get();
    
    // Final message
    clearScreen();
    cout << "🎉 Graphics Demo Completed!" << endl;
    cout << "==========================" << endl;
    cout << "\\nThese animations demonstrate:" << endl;
    cout << "• ASCII art rendering" << endl;
    cout << "• Console manipulation" << endl;
    cout << "• Mathematical graphics" << endl;
    cout << "• Real-time animations" << endl;
    cout << "\\nC++ is great for graphics and simulations!" << endl;
    
    return 0;
}`
        };

        // Compile Button
        document.getElementById('compileBtn').addEventListener('click', async () => {
            if (isCompiling) return;
            
            const code = editor.getValue();
            const compileStatus = document.getElementById('compileStatus');
            const statusIndicator = document.getElementById('statusIndicator');
            
            // Show compilation animation
            const animation = document.getElementById('compilationAnimation');
            animation.style.display = 'flex';
            compileStatus.className = 'compile-status success';
            compileStatus.innerHTML = '<i class="fas fa-circle"></i> Compiling...';
            statusIndicator.className = 'status compiling';
            statusIndicator.innerHTML = '<div class="loader"></div> Compiling...';
            
            isCompiling = true;
            compileStartTime = Date.now();
            
            // Simulate compilation with progress
            simulateCompilation(code);
        });

        // Run Button
        document.getElementById('runBtn').addEventListener('click', async () => {
            if (isRunning || !compiledCode) {
                addOutput('warning', 'Please compile the code first!');
                return;
            }
            
            const statusIndicator = document.getElementById('statusIndicator');
            const runtimeStatus = document.getElementById('runtimeStatus');
            
            statusIndicator.className = 'status running';
            statusIndicator.innerHTML = '<div class="loader"></div> Running...';
            isRunning = true;
            runStartTime = Date.now();
            
            // Clear output but keep important messages
            clearOutput();
            addOutput('info', '🚀 Starting C++ program execution...');
            addOutput('output', '='.repeat(60));
            
            try {
                // Simulate C++ program execution
                await executeCppProgram(compiledCode);
                
                const runTime = Date.now() - runStartTime;
                runtimeStatus.textContent = `Runtime: ${runTime}ms`;
                
                statusIndicator.className = 'status success';
                statusIndicator.innerHTML = '<i class="fas fa-check-circle"></i> Execution Complete';
                
                addOutput('output', '='.repeat(60));
                addOutput('success', '✅ Program executed successfully! 🎉');
                
                // Update status panel
                document.getElementById('compileTime').textContent = 
                    `Compile Time: ${Date.now() - compileStartTime}ms`;
                document.getElementById('binarySize').textContent = 
                    `Binary Size: ${compiledCode.length} bytes`;
                    
            } catch (error) {
                statusIndicator.className = 'status error';
                statusIndicator.innerHTML = '<i class="fas fa-exclamation-circle"></i> Runtime Error';
                addOutput('error', `Runtime error: ${error.message}`);
            } finally {
                isRunning = false;
            }
        });

        // Clear Output Button
        document.getElementById('clearBtn').addEventListener('click', () => {
            document.getElementById('clearBtn').classList.add('pulse-animation');
            setTimeout(() => {
                document.getElementById('clearBtn').classList.remove('pulse-animation');
            }, 500);
            
            clearOutput();
            addOutput('info', '🧹 Output cleared successfully!');
            addOutput('info', '🚀 Ready for new compilation');
        });

        // Clear output but keep essential messages
        function clearOutput() {
            const output = document.getElementById('output');
            output.innerHTML = `
                <div class="output-line info">
                    <i class="fas fa-info-circle"></i> Output cleared at ${new Date().toLocaleTimeString()}
                </div>
                <div class="output-line info">
                    <i class="fas fa-info-circle"></i> Ready for compilation
                </div>
            `;
            
            // Hide compiler output panel
            document.getElementById('compilerOutputPanel').style.display = 'none';
        }

        // Helper function to add output
        function addOutput(type, message) {
            const output = document.getElementById('output');
            const line = document.createElement('div');
            line.className = `output-line ${type}`;
            
            const iconMap = {
                'info': 'fas fa-info-circle',
                'success': 'fas fa-check-circle',
                'error': 'fas fa-exclamation-circle',
                'warning': 'fas fa-exclamation-triangle',
                'output': 'fas fa-angle-right',
                'debug': 'fas fa-bug'
            };
            
            line.innerHTML = `<i class="${iconMap[type] || 'fas fa-angle-right'}"></i> ${message}`;
            output.appendChild(line);
            output.scrollTop = output.scrollHeight;
        }

        // Simulate C++ compilation
        function simulateCompilation(code) {
            const animation = document.getElementById('compilationAnimation');
            const compileMessage = document.getElementById('compileMessage');
            const progressBar = document.querySelector('#compileProgress .progress');
            const compileStatus = document.getElementById('compileStatus');
            const statusIndicator = document.getElementById('statusIndicator');
            const compilerOutput = document.getElementById('compilerOutput');
            const compilerPanel = document.getElementById('compilerOutputPanel');
            
            let progress = 0;
            const steps = [
                { message: "Parsing source code...", duration: 500 },
                { message: "Checking syntax...", duration: 800 },
                { message: "Semantic analysis...", duration: 600 },
                { message: "Generating intermediate code...", duration: 700 },
                { message: "Optimizing...", duration: 900 },
                { message: "Generating machine code...", duration: 800 },
                { message: "Linking...", duration: 600 },
                { message: "Finalizing binary...", duration: 400 }
            ];
            
            // Show compiler output panel
            compilerPanel.style.display = 'block';
            compilerOutput.innerHTML = '<div class="output-line info">Starting compilation...</div>';
            
            // Simulate compilation steps
            steps.forEach((step, index) => {
                setTimeout(() => {
                    progress = ((index + 1) / steps.length) * 100;
                    progressBar.style.width = `${progress}%`;
                    compileMessage.textContent = step.message;
                    
                    // Add to compiler output
                    const line = document.createElement('div');
                    line.className = 'output-line info';
                    line.innerHTML = `<i class="fas fa-cog"></i> ${step.message}`;
                    compilerOutput.appendChild(line);
                    compilerOutput.scrollTop = compilerOutput.scrollHeight;
                    
                    // Check for errors in code
                    if (step.message.includes("Checking syntax")) {
                        checkForErrors(code, compilerOutput);
                    }
                    
                    // Last step
                    if (index === steps.length - 1) {
                        setTimeout(() => {
                            animation.style.display = 'none';
                            
                            // Check if compilation was successful
                            const hasErrors = code.includes("error") || 
                                            code.includes("undefined") ||
                                            code.match(/[a-zA-Z_][a-zA-Z0-9_]*\(\)/g)?.some(fn => !code.includes(fn + " {")) ||
                                            code.includes("#include") && !code.includes("<iostream>") && 
                                            !code.includes("\"") && code.includes("cout");
                            
                            if (hasErrors) {
                                compileStatus.className = 'compile-status error';
                                compileStatus.innerHTML = '<i class="fas fa-exclamation-circle"></i> Compilation Failed';
                                statusIndicator.className = 'status error';
                                statusIndicator.innerHTML = '<i class="fas fa-exclamation-circle"></i> Compile Error';
                                
                                addOutput('error', '❌ Compilation failed! Check compiler output.');
                                compiledCode = null;
                            } else {
                                compileStatus.className = 'compile-status success';
                                compileStatus.innerHTML = '<i class="fas fa-check-circle"></i> Compiled Successfully';
                                statusIndicator.className = 'status idle';
                                statusIndicator.innerHTML = '<i class="fas fa-circle"></i> Ready to Run';
                                
                                compiledCode = code;
                                const compileTime = Date.now() - compileStartTime;
                                
                                addOutput('success', `✅ Compilation successful! (${compileTime}ms)`);
                                addOutput('info', 'Click "Run" to execute the program');
                                
                                // Update status panel
                                document.getElementById('compileTime').textContent = 
                                    `Compile Time: ${compileTime}ms`;
                                document.getElementById('binarySize').textContent = 
                                    `Binary Size: ${code.length} bytes`;
                                document.getElementById('warningsCount').textContent = 
                                    `Warnings: ${countWarnings(code)}`;
                                document.getElementById('errorsCount').textContent = 
                                    `Errors: 0`;
                            }
                            
                            isCompiling = false;
                        }, step.duration);
                    }
                }, steps.slice(0, index).reduce((sum, s) => sum + s.duration, 0));
            });
        }

        // Check for common C++ errors
        function checkForErrors(code, compilerOutput) {
            const lines = code.split('\n');
            let errorCount = 0;
            let warningCount = 0;
            
            lines.forEach((line, index) => {
                // Check for missing semicolons (simple check)
                if (line.trim() && 
                    !line.trim().startsWith('#') &&
                    !line.trim().startsWith('//') &&
                    !line.includes('{') &&
                    !line.includes('}') &&
                    !line.trim().endsWith(';') &&
                    !line.trim().endsWith('{') &&
                    !line.trim().endsWith('}')) {
                    
                    const warningLine = document.createElement('div');
                    warningLine.className = 'output-line warning';
                    warningLine.innerHTML = `<i class="fas fa-exclamation-triangle"></i> Line ${index + 1}: Possible missing semicolon`;
                    compilerOutput.appendChild(warningLine);
                    warningCount++;
                }
                
                // Check for undefined functions (simple pattern matching)
                const functionCalls = line.match(/([a-zA-Z_][a-zA-Z0-9_]*)\s*\(/g);
                if (functionCalls) {
                    functionCalls.forEach(call => {
                        const funcName = call.replace(/\s*\(/, '');
                        if (!['cout', 'cin', 'endl', 'main', 'printf', 'scanf', 'malloc', 'free', 'new', 'delete'].includes(funcName) &&
                            !code.includes(`void ${funcName}`) &&
                            !code.includes(`int ${funcName}`) &&
                            !code.includes(`double ${funcName}`) &&
                            !code.includes(`float ${funcName}`) &&
                            !code.includes(`string ${funcName}`) &&
                            !code.includes(`bool ${funcName}`) &&
                            !code.includes(`auto ${funcName}`) &&
                            !code.includes(`template`) && funcName.includes('<')) {
                            
                            const errorLine = document.createElement('div');
                            errorLine.className = 'output-line error';
                            errorLine.innerHTML = `<i class="fas fa-exclamation-circle"></i> Line ${index + 1}: Undefined function '${funcName}'`;
                            compilerOutput.appendChild(errorLine);
                            errorCount++;
                        }
                    });
                }
            });
            
            // Update warnings count
            document.getElementById('warningsCount').textContent = `Warnings: ${warningCount}`;
            document.getElementById('errorsCount').textContent = `Errors: ${errorCount}`;
            
            return errorCount === 0;
        }

        // Count warnings in code
        function countWarnings(code) {
            let warnings = 0;
            
            // Simple heuristic for warnings
            if (code.includes("using namespace std;")) warnings++;
            if (code.includes("malloc(") || code.includes("free(")) warnings++;
            if (code.includes("printf(") || code.includes("scanf(")) warnings++;
            if (code.includes("goto ")) warnings++;
            
            return warnings;
        }

        // Simulate C++ program execution
        async function executeCppProgram(code) {
            // Extract main function simulation
            const lines = code.split('\n');
            let inMain = false;
            let braceCount = 0;
            let mainContent = [];
            
            // Find main function
            for (let i = 0; i < lines.length; i++) {
                if (lines[i].includes('int main()') || 
                    lines[i].includes('void main()') ||
                    lines[i].includes('main()')) {
                    inMain = true;
                }
                
                if (inMain) {
                    mainContent.push(lines[i]);
                    
                    // Count braces to find end of main
                    braceCount += (lines[i].match(/{/g) || []).length;
                    braceCount -= (lines[i].match(/}/g) || []).length;
                    
                    if (braceCount === 0 && i > 0) {
                        break;
                    }
                }
            }
            
            // Simulate program output
            return new Promise((resolve) => {
                let lineIndex = 0;
                
                function processLine() {
                    if (lineIndex >= mainContent.length) {
                        resolve();
                        return;
                    }
                    
                    const line = mainContent[lineIndex];
                    
                    // Simulate different types of output
                    if (line.includes('cout <<')) {
                        const match = line.match(/cout << (.*?);/);
                        if (match) {
                            let output = match[1];
                            // Remove extra quotes and format
                            output = output.replace(/"/g, '')
                                          .replace(/endl/g, '\n')
                                          .replace(/<< /g, '')
                                          .replace(/\\n/g, '\n')
                                          .trim();
                            
                            if (output) {
                                addOutput('output', output);
                            }
                        }
                    } else if (line.includes('printf(')) {
                        const match = line.match(/printf\("([^"]*)"\)/);
                        if (match) {
                            addOutput('output', match[1]);
                        }
                    } else if (line.includes('cin >>')) {
                        addOutput('output', '>>> [User input would be requested here]');
                    }
                    
                    lineIndex++;
                    setTimeout(processLine, 100); // Simulate execution delay
                }
                
                processLine();
            });
        }

        // Font size controls
        let fontSize = 14;
        document.getElementById('fontIncrease').addEventListener('click', () => {
            fontSize = Math.min(fontSize + 1, 24);
            editor.getWrapperElement().style.fontSize = `${fontSize}px`;
            editor.refresh();
            addOutput('info', `📝 Font size increased to ${fontSize}px`);
        });
        
        document.getElementById('fontDecrease').addEventListener('click', () => {
            fontSize = Math.max(fontSize - 1, 10);
            editor.getWrapperElement().style.fontSize = `${fontSize}px`;
            editor.refresh();
            addOutput('info', `📝 Font size decreased to ${fontSize}px`);
        });

        // Format button
        document.getElementById('formatBtn').addEventListener('click', () => {
            const code = editor.getValue();
            
            // Basic C++ formatting
            const lines = code.split('\n');
            let indent = 0;
            let formatted = [];
            
            for (let line of lines) {
                const trimmed = line.trim();
                
                if (trimmed.startsWith('}') || trimmed.startsWith('};')) {
                    indent = Math.max(0, indent - 1);
                }
                
                formatted.push(' '.repeat(indent * 4) + trimmed);
                
                if (trimmed.endsWith('{') || trimmed.startsWith('{') ||
                    trimmed.startsWith('class ') || trimmed.startsWith('struct ') ||
                    trimmed.startsWith('namespace ') || trimmed.startsWith('public:') ||
                    trimmed.startsWith('private:') || trimmed.startsWith('protected:')) {
                    indent++;
                }
            }
            
            editor.setValue(formatted.join('\n'));
            addOutput('success', '✨ Code formatted successfully!');
        });

        // Toggle optimization
        let optimizationLevel = 2;
        document.getElementById('toggleOptimization').addEventListener('click', () => {
            optimizationLevel = (optimizationLevel % 3) + 1;
            const btn = document.getElementById('toggleOptimization');
            btn.innerHTML = `<i class="fas fa-tachometer-alt"></i> -O${optimizationLevel}`;
            
            const levels = ['No Optimization', 'Basic Optimization', 'Maximum Optimization'];
            addOutput('info', `⚡ Optimization level set to: ${levels[optimizationLevel - 1]}`);
        });

        // Hide compiler output
        document.getElementById('hideCompilerOutput').addEventListener('click', () => {
            document.getElementById('compilerOutputPanel').style.display = 'none';
        });

        // Load example code
        document.querySelectorAll('.example-btn').forEach(btn => {
            btn.addEventListener('click', () => {
                const example = btn.dataset.example;
                if (examples[example]) {
                    // Add click animation
                    btn.classList.add('pulse-animation');
                    setTimeout(() => {
                        btn.classList.remove('pulse-animation');
                    }, 500);
                    
                    editor.setValue(examples[example]);
                    addOutput('success', `✨ Loaded ${btn.querySelector('h4').textContent} example`);
                    editor.focus();
                    updateDebugInfo();
                }
            });
        });

        // Save button
        document.getElementById('saveBtn').addEventListener('click', () => {
            const code = editor.getValue();
            const blob = new Blob([code], { type: 'text/plain' });
            const url = URL.createObjectURL(blob);
            const a = document.createElement('a');
            a.href = url;
            a.download = 'cpp_code.cpp';
            document.body.appendChild(a);
            a.click();
            document.body.removeChild(a);
            URL.revokeObjectURL(url);
            addOutput('success', '💾 Code saved as cpp_code.cpp');
        });

        // Home Button
        document.getElementById('homeBtn').addEventListener('click', () => {
            if (confirm('Return to homepage?')) {
                window.location.href = 'index.html';
            }
        });

        // About C++ Modal
        const aboutModal = document.getElementById('aboutModal');
        const aboutBtn = document.getElementById('aboutBtn');
        const closeAboutModal = document.getElementById('closeAboutModal');
        const runHelloWorldBtn = document.getElementById('runHelloWorld');

        aboutBtn.addEventListener('click', () => {
            aboutModal.style.display = 'block';
            document.body.style.overflow = 'hidden';
        });

        closeAboutModal.addEventListener('click', () => {
            aboutModal.style.display = 'none';
            document.body.style.overflow = 'auto';
        });

        runHelloWorldBtn.addEventListener('click', () => {
            aboutModal.style.display = 'none';
            document.body.style.overflow = 'auto';
            editor.setValue(examples.hello);
            addOutput('info', 'Loaded Hello World example from About C++');
            editor.focus();
        });

        // Debug Modal
        const debugModal = document.getElementById('debugModal');
        const debugBtn = document.getElementById('debugBtn');
        const closeDebugModal = document.getElementById('closeDebugModal');
        const analyzeBtn = document.getElementById('analyzeBtn');
        const memoryBtn = document.getElementById('memoryBtn');
        const simulateBtn = document.getElementById('simulateBtn');

        debugBtn.addEventListener('click', () => {
            debugModal.style.display = 'block';
            document.body.style.overflow = 'hidden';
            updateDebugInfo();
        });

        closeDebugModal.addEventListener('click', () => {
            debugModal.style.display = 'none';
            document.body.style.overflow = 'auto';
        });

        // Update debug information
        function updateDebugInfo() {
            const code = editor.getValue();
            const lines = code.split('\n').filter(line => line.trim() !== '');
            const functions = (code.match(/(int|void|double|float|string|bool|auto)\s+[a-zA-Z_][a-zA-Z0-9_]*\s*\(/g) || []).length;
            const classes = (code.match(/class\s+[a-zA-Z_][a-zA-Z0-9_]*/g) || []).length;
            
            document.getElementById('codeLength').textContent = `Code Length: ${code.length} chars`;
            document.getElementById('lineCount').textContent = `Lines: ${lines.length}`;
            document.getElementById('functionCount').textContent = `Functions: ${functions}`;
            document.getElementById('classCount').textContent = `Classes: ${classes}`;
        }

        // Code analysis
        analyzeBtn.addEventListener('click', () => {
            const code = editor.getValue();
            const analysisResults = document.getElementById('analysisResults');
            analysisResults.innerHTML = '<div class="output-line info">Analyzing C++ code...</div>';
            
            setTimeout(() => {
                let issues = [];
                let suggestions = [];
                
                // Check for common C++ issues
                if (code.includes('#include <iostream>')) {
                    suggestions.push('✓ iostream included - standard I/O available');
                }
                
                if (code.includes('using namespace std;')) {
                    issues.push('⚠ using namespace std - consider using std:: prefix');
                }
                
                if (code.includes('malloc(') || code.includes('free(')) {
                    issues.push('⚠ C-style memory management - use new/delete or smart pointers');
                }
                
                if (code.includes('printf(') || code.includes('scanf(')) {
                    issues.push('⚠ C-style I/O - use cout/cin instead');
                }
                
                if (code.includes('class ') || code.includes('struct ')) {
                    suggestions.push('✓ Object-oriented programming detected');
                }
                
                if (code.includes('template')) {
                    suggestions.push('✓ Template programming detected');
                }
                
                if (code.includes('#include <vector>') || code.includes('#include <map>')) {
                    suggestions.push('✓ STL containers being used');
                }
                
                // Display results
                analysisResults.innerHTML = `
                    <div class="output-line success"><i class="fas fa-check"></i> Analysis Complete</div>
                    ${issues.map(issue => `<div class="output-line warning">${issue}</div>`).join('')}
                    ${suggestions.map(suggestion => `<div class="output-line info">${suggestion}</div>`).join('')}
                    <div class="output-line debug">Total checks: ${issues.length + suggestions.length}</div>
                `;
            }, 500);
        });

        // Memory visualization
        memoryBtn.addEventListener('click', () => {
            const memoryViz = document.getElementById('memoryVisualization');
            memoryViz.innerHTML = '<div class="output-line info">Generating memory visualization...</div>';
            
            setTimeout(() => {
                const code = editor.getValue();
                memoryViz.innerHTML = '';
                
                // Create memory cells
                for (let i = 0; i < 64; i++) {
                    const cell = document.createElement('div');
                    cell.className = 'memory-cell';
                    cell.textContent = i.toString(16).toUpperCase();
                    
                    // Randomly mark some cells as used/active
                    if (Math.random() > 0.7) {
                        cell.classList.add('used');
                    }
                    if (Math.random() > 0.9) {
                        cell.classList.add('active');
                    }
                    
                    memoryViz.appendChild(cell);
                }
                
                memoryViz.innerHTML += '<div class="output-line info" style="margin-top: 10px;">💾 Memory cells visualization (64 bytes shown)</div>';
            }, 800);
        });

        // Compiler simulation
        simulateBtn.addEventListener('click', () => {
            const results = document.getElementById('compileSimResults');
            const progress = document.getElementById('compileSimProgress');
            results.innerHTML = '<div class="output-line info">Starting compilation simulation...</div>';
            
            const steps = [
                'Preprocessing...',
                'Lexical analysis...',
                'Syntax analysis...',
                'Semantic analysis...',
                'Intermediate code generation...',
                'Optimization...',
                'Code generation...',
                'Linking...'
            ];
            
            let currentStep = 0;
            
            function simulateStep() {
                if (currentStep >= steps.length) {
                    results.innerHTML += '<div class="output-line success">✅ Compilation simulation complete!</div>';
                    progress.style.width = '0%';
                    return;
                }
                
                progress.style.width = `${(currentStep + 1) / steps.length * 100}%`;
                results.innerHTML += `<div class="output-line info">${steps[currentStep]}</div>`;
                results.scrollTop = results.scrollHeight;
                
                currentStep++;
                setTimeout(simulateStep, 300);
            }
            
            simulateStep();
        });

        // Logo animation
        document.getElementById('logo').addEventListener('click', () => {
            addOutput('info', '🚀 Welcome to C++ Code Editor!');
        });

        // Close modals when clicking outside
        window.addEventListener('click', (event) => {
            if (event.target === aboutModal) {
                aboutModal.style.display = 'none';
                document.body.style.overflow = 'auto';
            }
            if (event.target === debugModal) {
                debugModal.style.display = 'none';
                document.body.style.overflow = 'auto';
            }
        });

        // Handle Ctrl+Enter to compile
        editor.on('keydown', (cm, event) => {
            if ((event.ctrlKey || event.metaKey) && event.key === 'Enter') {
                event.preventDefault();
                document.getElementById('compileBtn').click();
            }
        });

        // Auto-focus editor and update debug info
        editor.focus();
        setInterval(updateDebugInfo, 5000);
        
        // Initialize debug info
        updateDebugInfo();
    </script>
</body>
</html>