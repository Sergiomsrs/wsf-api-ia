CREATE TABLE employee_context (
                                  id SERIAL PRIMARY KEY,
                                  employee_id INT NOT NULL,
                                  last_week_shift VARCHAR(20),      -- "morning", "evening", "night"
                                  total_night_shifts INT DEFAULT 0,
                                  total_morning_shifts INT DEFAULT 0,
                                  total_evening_shifts INT DEFAULT 0,
                                  updated_at TIMESTAMP DEFAULT now()
);

CREATE TABLE week_history (
                              id SERIAL PRIMARY KEY,
                              week_start DATE NOT NULL,
                              week_end DATE NOT NULL,
                              generated_by_ai BOOLEAN DEFAULT TRUE,
                              created_at TIMESTAMP DEFAULT now()
);

CREATE TABLE ai_prompt_log (
                               id SERIAL PRIMARY KEY,
                               prompt TEXT NOT NULL,
                               response TEXT NOT NULL,
                               created_at TIMESTAMP DEFAULT now()
);
