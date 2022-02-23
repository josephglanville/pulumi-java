// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGetArgs;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs();

    /**
     * Whether dependencies should also be installed. - install when false: `rpm --upgrade --replacepkgs package.rpm` - install when true: `yum -y install package.rpm` or `zypper -y install package.rpm`
     * 
     */
    @InputImport(name="pullDeps")
      private final @Nullable Input<Boolean> pullDeps;

    public Input<Boolean> getPullDeps() {
        return this.pullDeps == null ? Input.empty() : this.pullDeps;
    }

    /**
     * Required. An rpm package.
     * 
     */
    @InputImport(name="source", required=true)
      private final Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGetArgs> source;

    public Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGetArgs> getSource() {
        return this.source;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs(
        @Nullable Input<Boolean> pullDeps,
        Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGetArgs> source) {
        this.pullDeps = pullDeps;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs() {
        this.pullDeps = Input.empty();
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> pullDeps;
        private Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGetArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pullDeps = defaults.pullDeps;
    	      this.source = defaults.source;
        }

        public Builder setPullDeps(@Nullable Input<Boolean> pullDeps) {
            this.pullDeps = pullDeps;
            return this;
        }

        public Builder setPullDeps(@Nullable Boolean pullDeps) {
            this.pullDeps = Input.ofNullable(pullDeps);
            return this;
        }

        public Builder setSource(Input<OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGetArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebSourceGetArgs source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourcePkgDebGetArgs(pullDeps, source);
        }
    }
}
