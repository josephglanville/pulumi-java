// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.enums.AccessRightsDescription;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionArgs Empty = new SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionArgs();

    @InputImport(name="keyName", required=true)
    private final Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName;
    }

    @InputImport(name="primaryKey")
    private final @Nullable Input<String> primaryKey;

    public Input<String> getPrimaryKey() {
        return this.primaryKey == null ? Input.empty() : this.primaryKey;
    }

    @InputImport(name="rights", required=true)
    private final Input<Either<String,AccessRightsDescription>> rights;

    public Input<Either<String,AccessRightsDescription>> getRights() {
        return this.rights;
    }

    @InputImport(name="secondaryKey")
    private final @Nullable Input<String> secondaryKey;

    public Input<String> getSecondaryKey() {
        return this.secondaryKey == null ? Input.empty() : this.secondaryKey;
    }

    public SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionArgs(
        Input<String> keyName,
        @Nullable Input<String> primaryKey,
        Input<Either<String,AccessRightsDescription>> rights,
        @Nullable Input<String> secondaryKey) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.primaryKey = primaryKey;
        this.rights = Objects.requireNonNull(rights, "expected parameter 'rights' to be non-null");
        this.secondaryKey = secondaryKey;
    }

    private SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionArgs() {
        this.keyName = Input.empty();
        this.primaryKey = Input.empty();
        this.rights = Input.empty();
        this.secondaryKey = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyName;
        private @Nullable Input<String> primaryKey;
        private Input<Either<String,AccessRightsDescription>> rights;
        private @Nullable Input<String> secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.primaryKey = defaults.primaryKey;
    	      this.rights = defaults.rights;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder setKeyName(Input<String> keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder setKeyName(String keyName) {
            this.keyName = Input.of(Objects.requireNonNull(keyName));
            return this;
        }

        public Builder setPrimaryKey(@Nullable Input<String> primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder setPrimaryKey(@Nullable String primaryKey) {
            this.primaryKey = Input.ofNullable(primaryKey);
            return this;
        }

        public Builder setRights(Input<Either<String,AccessRightsDescription>> rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }

        public Builder setRights(Either<String,AccessRightsDescription> rights) {
            this.rights = Input.of(Objects.requireNonNull(rights));
            return this;
        }

        public Builder setSecondaryKey(@Nullable Input<String> secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }

        public Builder setSecondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = Input.ofNullable(secondaryKey);
            return this;
        }

        public SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionArgs build() {
            return new SharedAccessSignatureAuthorizationRuleAccessRightsDescriptionArgs(keyName, primaryKey, rights, secondaryKey);
        }
    }
}
