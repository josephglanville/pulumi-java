// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A package managed by Zypper. - install: `zypper -y install package` - remove: `zypper -y rm package`
 * 
 */
public final class OSPolicyResourcePackageResourceZypperResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourcePackageResourceZypperResponse Empty = new OSPolicyResourcePackageResourceZypperResponse();

    /**
     * Package name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public OSPolicyResourcePackageResourceZypperResponse(String name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private OSPolicyResourcePackageResourceZypperResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourcePackageResourceZypperResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourcePackageResourceZypperResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public OSPolicyResourcePackageResourceZypperResponse build() {
            return new OSPolicyResourcePackageResourceZypperResponse(name);
        }
    }
}
