// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.inputs.NfsAccessRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A set of rules describing access policies applied to NFSv3 clients of the cache.
 * 
 */
public final class NfsAccessPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final NfsAccessPolicyArgs Empty = new NfsAccessPolicyArgs();

    /**
     * The set of rules describing client accesses allowed under this policy.
     * 
     */
    @InputImport(name="accessRules", required=true)
      private final Input<List<NfsAccessRuleArgs>> accessRules;

    public Input<List<NfsAccessRuleArgs>> getAccessRules() {
        return this.accessRules;
    }

    /**
     * Name identifying this policy. Access Policy names are not case sensitive.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public NfsAccessPolicyArgs(
        Input<List<NfsAccessRuleArgs>> accessRules,
        Input<String> name) {
        this.accessRules = Objects.requireNonNull(accessRules, "expected parameter 'accessRules' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private NfsAccessPolicyArgs() {
        this.accessRules = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NfsAccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<NfsAccessRuleArgs>> accessRules;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(NfsAccessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessRules = defaults.accessRules;
    	      this.name = defaults.name;
        }

        public Builder setAccessRules(Input<List<NfsAccessRuleArgs>> accessRules) {
            this.accessRules = Objects.requireNonNull(accessRules);
            return this;
        }

        public Builder setAccessRules(List<NfsAccessRuleArgs> accessRules) {
            this.accessRules = Input.of(Objects.requireNonNull(accessRules));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public NfsAccessPolicyArgs build() {
            return new NfsAccessPolicyArgs(accessRules, name);
        }
    }
}
