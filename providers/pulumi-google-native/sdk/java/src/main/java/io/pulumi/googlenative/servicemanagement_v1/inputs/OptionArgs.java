// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A protocol buffer option, which can be attached to a message, field, enumeration, etc.
 * 
 */
public final class OptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final OptionArgs Empty = new OptionArgs();

    /**
     * The option's name. For protobuf built-in options (options defined in descriptor.proto), this is the short name. For example, `"map_entry"`. For custom options, it should be the fully-qualified name. For example, `"google.api.http"`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The option's value packed in an Any message. If the value is a primitive, the corresponding wrapper type defined in google/protobuf/wrappers.proto should be used. If the value is an enum, it should be stored as an int32 value using the google.protobuf.Int32Value type.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<Map<String,String>> value;

    public Output<Map<String,String>> getValue() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public OptionArgs(
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> value) {
        this.name = name;
        this.value = value;
    }

    private OptionArgs() {
        this.name = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> value;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder value(@Nullable Output<Map<String,String>> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable Map<String,String> value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public OptionArgs build() {
            return new OptionArgs(name, value);
        }
    }
}
