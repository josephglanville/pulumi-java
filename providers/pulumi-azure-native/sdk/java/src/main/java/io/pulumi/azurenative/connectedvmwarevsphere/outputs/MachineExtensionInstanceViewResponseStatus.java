// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MachineExtensionInstanceViewResponseStatus {
    /**
     * The status code.
     * 
     */
    private final String code;
    /**
     * The short localizable label for the status.
     * 
     */
    private final String displayStatus;
    /**
     * The level code.
     * 
     */
    private final String level;
    /**
     * The detailed status message, including for alerts and error messages.
     * 
     */
    private final String message;
    /**
     * The time of the status.
     * 
     */
    private final String time;

    @CustomType.Constructor
    private MachineExtensionInstanceViewResponseStatus(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("displayStatus") String displayStatus,
        @CustomType.Parameter("level") String level,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("time") String time) {
        this.code = code;
        this.displayStatus = displayStatus;
        this.level = level;
        this.message = message;
        this.time = time;
    }

    /**
     * The status code.
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * The short localizable label for the status.
     * 
    */
    public String getDisplayStatus() {
        return this.displayStatus;
    }
    /**
     * The level code.
     * 
    */
    public String getLevel() {
        return this.level;
    }
    /**
     * The detailed status message, including for alerts and error messages.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * The time of the status.
     * 
    */
    public String getTime() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MachineExtensionInstanceViewResponseStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String displayStatus;
        private String level;
        private String message;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(MachineExtensionInstanceViewResponseStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayStatus = defaults.displayStatus;
    	      this.level = defaults.level;
    	      this.message = defaults.message;
    	      this.time = defaults.time;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public Builder displayStatus(String displayStatus) {
            this.displayStatus = Objects.requireNonNull(displayStatus);
            return this;
        }
        public Builder level(String level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder time(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }        public MachineExtensionInstanceViewResponseStatus build() {
            return new MachineExtensionInstanceViewResponseStatus(code, displayStatus, level, message, time);
        }
    }
}
