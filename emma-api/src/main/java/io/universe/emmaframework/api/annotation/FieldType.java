package io.universe.emmaframework.api.annotation;

/**
 * @author Sir.D
 */
public enum FieldType {
    Inference,
    Identifier {
        public boolean isSearchable() {
            return true;
        }
    },
    Date {
        public boolean isDate() {
            return true;
        }
    },
    DateTime {
        public boolean isDate() {
            return true;
        }
    },
    Time {
        public boolean isDate() {
            return true;
        }
    },
    Int {
        public boolean isNumber() {
            return true;
        }
    },
    Float {
        public boolean isNumber() {
            return true;
        }
    },
    Boolean,
    Enum,
    Image {
        public boolean isString() {
            return true;
        }
    },
    Password {
        public boolean isString() {
            return true;
        }
    },
    Email {
        public boolean isSearchable() {
            return true;
        }

        public boolean isString() {
            return true;
        }
    },
    Phone {
        public boolean isSearchable() {
            return true;
        }

        public boolean isString() {
            return true;
        }
    },
    Json {
        public boolean isJson() {
            return true;
        }
    };


    private FieldType() {
    }

}
