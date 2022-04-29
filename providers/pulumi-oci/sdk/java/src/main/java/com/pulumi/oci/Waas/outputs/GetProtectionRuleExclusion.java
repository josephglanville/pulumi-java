// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetProtectionRuleExclusion {
    /**
     * @return An array of The target property of a request that would allow it to bypass the protection rule. For example, when `target` is `REQUEST_COOKIE_NAMES`, the list may include names of cookies to exclude from the protection rule. When the target is `ARGS`, the list may include strings of URL query parameters and values from form-urlencoded XML, JSON, AMP, or POST payloads to exclude from the protection rule. `Exclusions` properties must not contain whitespace, comma or |. **Note:** If protection rules have been enabled that utilize the `maxArgumentCount` or `maxTotalNameLengthOfArguments` properties, and the `target` property has been set to `ARGS`, it is important that the `exclusions` properties be defined to honor those protection rule settings in a consistent manner.
     * 
     */
    private final List<String> exclusions;
    /**
     * @return The target of the exclusion.
     * 
     */
    private final String target;

    @CustomType.Constructor
    private GetProtectionRuleExclusion(
        @CustomType.Parameter("exclusions") List<String> exclusions,
        @CustomType.Parameter("target") String target) {
        this.exclusions = exclusions;
        this.target = target;
    }

    /**
     * @return An array of The target property of a request that would allow it to bypass the protection rule. For example, when `target` is `REQUEST_COOKIE_NAMES`, the list may include names of cookies to exclude from the protection rule. When the target is `ARGS`, the list may include strings of URL query parameters and values from form-urlencoded XML, JSON, AMP, or POST payloads to exclude from the protection rule. `Exclusions` properties must not contain whitespace, comma or |. **Note:** If protection rules have been enabled that utilize the `maxArgumentCount` or `maxTotalNameLengthOfArguments` properties, and the `target` property has been set to `ARGS`, it is important that the `exclusions` properties be defined to honor those protection rule settings in a consistent manner.
     * 
     */
    public List<String> exclusions() {
        return this.exclusions;
    }
    /**
     * @return The target of the exclusion.
     * 
     */
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProtectionRuleExclusion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> exclusions;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProtectionRuleExclusion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exclusions = defaults.exclusions;
    	      this.target = defaults.target;
        }

        public Builder exclusions(List<String> exclusions) {
            this.exclusions = Objects.requireNonNull(exclusions);
            return this;
        }
        public Builder exclusions(String... exclusions) {
            return exclusions(List.of(exclusions));
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public GetProtectionRuleExclusion build() {
            return new GetProtectionRuleExclusion(exclusions, target);
        }
    }
}
