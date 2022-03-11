// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs();

    /**
     * Additional properties to use during installation. This should be in the format of Property=Setting. Appended to the defaults of `ACTION=INSTALL REBOOT=ReallySuppress`.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Output<List<String>> properties;

    public Output<List<String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Required. An rpm package.
     * 
     */
    @InputImport(name="source", required=true)
      private final Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs> source;

    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs> getSource() {
        return this.source;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs(
        @Nullable Output<List<String>> properties,
        Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs> source) {
        this.properties = properties;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs() {
        this.properties = Output.empty();
        this.source = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> properties;
        private Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.source = defaults.source;
        }

        public Builder properties(@Nullable Output<List<String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable List<String> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }

        public Builder source(Output<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder source(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiSourceArgs source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgMsiArgs(properties, source);
        }
    }
}
