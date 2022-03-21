// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The iOS apps that are allowed to use the key.
 * 
 */
public final class V2IosKeyRestrictionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final V2IosKeyRestrictionsResponse Empty = new V2IosKeyRestrictionsResponse();

    /**
     * A list of bundle IDs that are allowed when making API calls with this key.
     * 
     */
    @Import(name="allowedBundleIds", required=true)
      private final List<String> allowedBundleIds;

    public List<String> getAllowedBundleIds() {
        return this.allowedBundleIds;
    }

    public V2IosKeyRestrictionsResponse(List<String> allowedBundleIds) {
        this.allowedBundleIds = Objects.requireNonNull(allowedBundleIds, "expected parameter 'allowedBundleIds' to be non-null");
    }

    private V2IosKeyRestrictionsResponse() {
        this.allowedBundleIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2IosKeyRestrictionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedBundleIds;

        public Builder() {
    	      // Empty
        }

        public Builder(V2IosKeyRestrictionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedBundleIds = defaults.allowedBundleIds;
        }

        public Builder allowedBundleIds(List<String> allowedBundleIds) {
            this.allowedBundleIds = Objects.requireNonNull(allowedBundleIds);
            return this;
        }
        public Builder allowedBundleIds(String... allowedBundleIds) {
            return allowedBundleIds(List.of(allowedBundleIds));
        }        public V2IosKeyRestrictionsResponse build() {
            return new V2IosKeyRestrictionsResponse(allowedBundleIds);
        }
    }
}
