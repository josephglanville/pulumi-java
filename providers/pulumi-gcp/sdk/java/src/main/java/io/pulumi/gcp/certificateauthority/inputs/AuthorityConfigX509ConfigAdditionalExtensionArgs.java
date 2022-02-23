// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigAdditionalExtensionObjectIdArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class AuthorityConfigX509ConfigAdditionalExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigAdditionalExtensionArgs Empty = new AuthorityConfigX509ConfigAdditionalExtensionArgs();

    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to
     * handle this extension, the client should consider this to be an error).
     * 
     */
    @InputImport(name="critical", required=true)
      private final Input<Boolean> critical;

    public Input<Boolean> getCritical() {
        return this.critical;
    }

    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @InputImport(name="objectId", required=true)
      private final Input<AuthorityConfigX509ConfigAdditionalExtensionObjectIdArgs> objectId;

    public Input<AuthorityConfigX509ConfigAdditionalExtensionObjectIdArgs> getObjectId() {
        return this.objectId;
    }

    /**
     * The value of this X.509 extension. A base64-encoded string.
     * 
     */
    @InputImport(name="value", required=true)
      private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public AuthorityConfigX509ConfigAdditionalExtensionArgs(
        Input<Boolean> critical,
        Input<AuthorityConfigX509ConfigAdditionalExtensionObjectIdArgs> objectId,
        Input<String> value) {
        this.critical = Objects.requireNonNull(critical, "expected parameter 'critical' to be non-null");
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private AuthorityConfigX509ConfigAdditionalExtensionArgs() {
        this.critical = Input.empty();
        this.objectId = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigX509ConfigAdditionalExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> critical;
        private Input<AuthorityConfigX509ConfigAdditionalExtensionObjectIdArgs> objectId;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigX509ConfigAdditionalExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder setCritical(Input<Boolean> critical) {
            this.critical = Objects.requireNonNull(critical);
            return this;
        }

        public Builder setCritical(Boolean critical) {
            this.critical = Input.of(Objects.requireNonNull(critical));
            return this;
        }

        public Builder setObjectId(Input<AuthorityConfigX509ConfigAdditionalExtensionObjectIdArgs> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setObjectId(AuthorityConfigX509ConfigAdditionalExtensionObjectIdArgs objectId) {
            this.objectId = Input.of(Objects.requireNonNull(objectId));
            return this;
        }

        public Builder setValue(Input<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public AuthorityConfigX509ConfigAdditionalExtensionArgs build() {
            return new AuthorityConfigX509ConfigAdditionalExtensionArgs(critical, objectId, value);
        }
    }
}
