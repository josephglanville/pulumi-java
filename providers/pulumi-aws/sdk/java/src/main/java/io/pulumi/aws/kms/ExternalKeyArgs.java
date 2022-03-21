// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExternalKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalKeyArgs Empty = new ExternalKeyArgs();

    /**
     * Specifies whether to disable the policy lockout check performed when creating or updating the key's policy. Setting this value to `true` increases the risk that the key becomes unmanageable. For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the AWS Key Management Service Developer Guide. Defaults to `false`.
     * 
     */
    @Import(name="bypassPolicyLockoutSafetyCheck")
      private final @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;

    public Output<Boolean> getBypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck == null ? Output.empty() : this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
     * 
     */
    @Import(name="deletionWindowInDays")
      private final @Nullable Output<Integer> deletionWindowInDays;

    public Output<Integer> getDeletionWindowInDays() {
        return this.deletionWindowInDays == null ? Output.empty() : this.deletionWindowInDays;
    }

    /**
     * Description of the key.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
     * 
     */
    @Import(name="keyMaterialBase64")
      private final @Nullable Output<String> keyMaterialBase64;

    public Output<String> getKeyMaterialBase64() {
        return this.keyMaterialBase64 == null ? Output.empty() : this.keyMaterialBase64;
    }

    /**
     * Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
     * 
     */
    @Import(name="multiRegion")
      private final @Nullable Output<Boolean> multiRegion;

    public Output<Boolean> getMultiRegion() {
        return this.multiRegion == null ? Output.empty() : this.multiRegion;
    }

    /**
     * A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy == null ? Output.empty() : this.policy;
    }

    /**
     * A key-value map of tags to assign to the key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    @Import(name="validTo")
      private final @Nullable Output<String> validTo;

    public Output<String> getValidTo() {
        return this.validTo == null ? Output.empty() : this.validTo;
    }

    public ExternalKeyArgs(
        @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck,
        @Nullable Output<Integer> deletionWindowInDays,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> keyMaterialBase64,
        @Nullable Output<Boolean> multiRegion,
        @Nullable Output<String> policy,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> validTo) {
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
        this.deletionWindowInDays = deletionWindowInDays;
        this.description = description;
        this.enabled = enabled;
        this.keyMaterialBase64 = keyMaterialBase64;
        this.multiRegion = multiRegion;
        this.policy = policy;
        this.tags = tags;
        this.validTo = validTo;
    }

    private ExternalKeyArgs() {
        this.bypassPolicyLockoutSafetyCheck = Output.empty();
        this.deletionWindowInDays = Output.empty();
        this.description = Output.empty();
        this.enabled = Output.empty();
        this.keyMaterialBase64 = Output.empty();
        this.multiRegion = Output.empty();
        this.policy = Output.empty();
        this.tags = Output.empty();
        this.validTo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;
        private @Nullable Output<Integer> deletionWindowInDays;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> keyMaterialBase64;
        private @Nullable Output<Boolean> multiRegion;
        private @Nullable Output<String> policy;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> validTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypassPolicyLockoutSafetyCheck = defaults.bypassPolicyLockoutSafetyCheck;
    	      this.deletionWindowInDays = defaults.deletionWindowInDays;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.keyMaterialBase64 = defaults.keyMaterialBase64;
    	      this.multiRegion = defaults.multiRegion;
    	      this.policy = defaults.policy;
    	      this.tags = defaults.tags;
    	      this.validTo = defaults.validTo;
        }

        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
            return this;
        }
        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Boolean bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = Output.ofNullable(bypassPolicyLockoutSafetyCheck);
            return this;
        }
        public Builder deletionWindowInDays(@Nullable Output<Integer> deletionWindowInDays) {
            this.deletionWindowInDays = deletionWindowInDays;
            return this;
        }
        public Builder deletionWindowInDays(@Nullable Integer deletionWindowInDays) {
            this.deletionWindowInDays = Output.ofNullable(deletionWindowInDays);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder keyMaterialBase64(@Nullable Output<String> keyMaterialBase64) {
            this.keyMaterialBase64 = keyMaterialBase64;
            return this;
        }
        public Builder keyMaterialBase64(@Nullable String keyMaterialBase64) {
            this.keyMaterialBase64 = Output.ofNullable(keyMaterialBase64);
            return this;
        }
        public Builder multiRegion(@Nullable Output<Boolean> multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }
        public Builder multiRegion(@Nullable Boolean multiRegion) {
            this.multiRegion = Output.ofNullable(multiRegion);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Output.ofNullable(policy);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder validTo(@Nullable Output<String> validTo) {
            this.validTo = validTo;
            return this;
        }
        public Builder validTo(@Nullable String validTo) {
            this.validTo = Output.ofNullable(validTo);
            return this;
        }        public ExternalKeyArgs build() {
            return new ExternalKeyArgs(bypassPolicyLockoutSafetyCheck, deletionWindowInDays, description, enabled, keyMaterialBase64, multiRegion, policy, tags, validTo);
        }
    }
}
