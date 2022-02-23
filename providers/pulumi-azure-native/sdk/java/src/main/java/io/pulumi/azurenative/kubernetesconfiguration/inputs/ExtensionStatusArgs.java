// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.azurenative.kubernetesconfiguration.enums.LevelType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Status from this instance of the extension.
 * 
 */
public final class ExtensionStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtensionStatusArgs Empty = new ExtensionStatusArgs();

    /**
     * Status code provided by the Extension
     * 
     */
    @InputImport(name="code")
      private final @Nullable Input<String> code;

    public Input<String> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * Short description of status of this instance of the extension.
     * 
     */
    @InputImport(name="displayStatus")
      private final @Nullable Input<String> displayStatus;

    public Input<String> getDisplayStatus() {
        return this.displayStatus == null ? Input.empty() : this.displayStatus;
    }

    /**
     * Level of the status.
     * 
     */
    @InputImport(name="level")
      private final @Nullable Input<Either<String,LevelType>> level;

    public Input<Either<String,LevelType>> getLevel() {
        return this.level == null ? Input.empty() : this.level;
    }

    /**
     * Detailed message of the status from the Extension instance.
     * 
     */
    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * DateLiteral (per ISO8601) noting the time of installation status.
     * 
     */
    @InputImport(name="time")
      private final @Nullable Input<String> time;

    public Input<String> getTime() {
        return this.time == null ? Input.empty() : this.time;
    }

    public ExtensionStatusArgs(
        @Nullable Input<String> code,
        @Nullable Input<String> displayStatus,
        @Nullable Input<Either<String,LevelType>> level,
        @Nullable Input<String> message,
        @Nullable Input<String> time) {
        this.code = code;
        this.displayStatus = displayStatus;
        this.level = level == null ? Input.ofLeft("Information") : level;
        this.message = message;
        this.time = time;
    }

    private ExtensionStatusArgs() {
        this.code = Input.empty();
        this.displayStatus = Input.empty();
        this.level = Input.empty();
        this.message = Input.empty();
        this.time = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> code;
        private @Nullable Input<String> displayStatus;
        private @Nullable Input<Either<String,LevelType>> level;
        private @Nullable Input<String> message;
        private @Nullable Input<String> time;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayStatus = defaults.displayStatus;
    	      this.level = defaults.level;
    	      this.message = defaults.message;
    	      this.time = defaults.time;
        }

        public Builder setCode(@Nullable Input<String> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable String code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setDisplayStatus(@Nullable Input<String> displayStatus) {
            this.displayStatus = displayStatus;
            return this;
        }

        public Builder setDisplayStatus(@Nullable String displayStatus) {
            this.displayStatus = Input.ofNullable(displayStatus);
            return this;
        }

        public Builder setLevel(@Nullable Input<Either<String,LevelType>> level) {
            this.level = level;
            return this;
        }

        public Builder setLevel(@Nullable Either<String,LevelType> level) {
            this.level = Input.ofNullable(level);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setTime(@Nullable Input<String> time) {
            this.time = time;
            return this;
        }

        public Builder setTime(@Nullable String time) {
            this.time = Input.ofNullable(time);
            return this;
        }
        public ExtensionStatusArgs build() {
            return new ExtensionStatusArgs(code, displayStatus, level, message, time);
        }
    }
}
