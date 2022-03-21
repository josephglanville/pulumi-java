// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Json write settings.
 * 
 */
public final class JsonWriteSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final JsonWriteSettingsArgs Empty = new JsonWriteSettingsArgs();

    /**
     * File pattern of JSON. This setting controls the way a collection of JSON objects will be treated. The default value is 'setOfObjects'. It is case-sensitive.
     * 
     */
    @Import(name="filePattern")
      private final @Nullable Output<Object> filePattern;

    public Output<Object> getFilePattern() {
        return this.filePattern == null ? Output.empty() : this.filePattern;
    }

    /**
     * The write setting type.
     * Expected value is 'JsonWriteSettings'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public JsonWriteSettingsArgs(
        @Nullable Output<Object> filePattern,
        Output<String> type) {
        this.filePattern = filePattern;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private JsonWriteSettingsArgs() {
        this.filePattern = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JsonWriteSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> filePattern;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(JsonWriteSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePattern = defaults.filePattern;
    	      this.type = defaults.type;
        }

        public Builder filePattern(@Nullable Output<Object> filePattern) {
            this.filePattern = filePattern;
            return this;
        }
        public Builder filePattern(@Nullable Object filePattern) {
            this.filePattern = Output.ofNullable(filePattern);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public JsonWriteSettingsArgs build() {
            return new JsonWriteSettingsArgs(filePattern, type);
        }
    }
}
