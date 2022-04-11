// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.AccessRights;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of an IoT hub shared access policy.
 * 
 */
public final class SharedAccessSignatureAuthorizationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SharedAccessSignatureAuthorizationRuleArgs Empty = new SharedAccessSignatureAuthorizationRuleArgs();

    /**
     * The name of the shared access policy.
     * 
     */
    @Import(name="keyName", required=true)
      private final Output<String> keyName;

    public Output<String> getKeyName() {
        return this.keyName;
    }

    /**
     * The primary key.
     * 
     */
    @Import(name="primaryKey")
      private final @Nullable Output<String> primaryKey;

    public Output<String> getPrimaryKey() {
        return this.primaryKey == null ? Codegen.empty() : this.primaryKey;
    }

    /**
     * The permissions assigned to the shared access policy.
     * 
     */
    @Import(name="rights", required=true)
      private final Output<AccessRights> rights;

    public Output<AccessRights> getRights() {
        return this.rights;
    }

    /**
     * The secondary key.
     * 
     */
    @Import(name="secondaryKey")
      private final @Nullable Output<String> secondaryKey;

    public Output<String> getSecondaryKey() {
        return this.secondaryKey == null ? Codegen.empty() : this.secondaryKey;
    }

    public SharedAccessSignatureAuthorizationRuleArgs(
        Output<String> keyName,
        @Nullable Output<String> primaryKey,
        Output<AccessRights> rights,
        @Nullable Output<String> secondaryKey) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.primaryKey = primaryKey;
        this.rights = Objects.requireNonNull(rights, "expected parameter 'rights' to be non-null");
        this.secondaryKey = secondaryKey;
    }

    private SharedAccessSignatureAuthorizationRuleArgs() {
        this.keyName = Codegen.empty();
        this.primaryKey = Codegen.empty();
        this.rights = Codegen.empty();
        this.secondaryKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedAccessSignatureAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyName;
        private @Nullable Output<String> primaryKey;
        private Output<AccessRights> rights;
        private @Nullable Output<String> secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedAccessSignatureAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.primaryKey = defaults.primaryKey;
    	      this.rights = defaults.rights;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder keyName(Output<String> keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder keyName(String keyName) {
            this.keyName = Output.of(Objects.requireNonNull(keyName));
            return this;
        }
        public Builder primaryKey(@Nullable Output<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }
        public Builder primaryKey(@Nullable String primaryKey) {
            this.primaryKey = Codegen.ofNullable(primaryKey);
            return this;
        }
        public Builder rights(Output<AccessRights> rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }
        public Builder rights(AccessRights rights) {
            this.rights = Output.of(Objects.requireNonNull(rights));
            return this;
        }
        public Builder secondaryKey(@Nullable Output<String> secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }
        public Builder secondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = Codegen.ofNullable(secondaryKey);
            return this;
        }        public SharedAccessSignatureAuthorizationRuleArgs build() {
            return new SharedAccessSignatureAuthorizationRuleArgs(keyName, primaryKey, rights, secondaryKey);
        }
    }
}
