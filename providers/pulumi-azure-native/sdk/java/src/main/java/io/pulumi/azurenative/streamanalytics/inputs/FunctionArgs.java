// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.ScalarFunctionPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A function object, containing all information associated with the named function. All functions are contained under a streaming job.
 * 
 */
public final class FunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

    /**
     * Resource name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The properties that are associated with a function.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<ScalarFunctionPropertiesArgs> properties;

    public Output<ScalarFunctionPropertiesArgs> getProperties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    public FunctionArgs(
        @Nullable Output<String> name,
        @Nullable Output<ScalarFunctionPropertiesArgs> properties) {
        this.name = name;
        this.properties = properties;
    }

    private FunctionArgs() {
        this.name = Codegen.empty();
        this.properties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<ScalarFunctionPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder properties(@Nullable Output<ScalarFunctionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ScalarFunctionPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }        public FunctionArgs build() {
            return new FunctionArgs(name, properties);
        }
    }
}
