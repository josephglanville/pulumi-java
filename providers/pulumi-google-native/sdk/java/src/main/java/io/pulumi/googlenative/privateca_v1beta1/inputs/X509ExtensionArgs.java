// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.inputs.ObjectIdArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * An X509Extension specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
 * 
 */
public final class X509ExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final X509ExtensionArgs Empty = new X509ExtensionArgs();

    /**
     * Indicates whether or not this extension is critical (i.e., if the client does not know how to handle this extension, the client should consider this to be an error).
     * 
     */
    @InputImport(name="critical", required=true)
      private final Output<Boolean> critical;

    public Output<Boolean> getCritical() {
        return this.critical;
    }

    /**
     * The OID for this X.509 extension.
     * 
     */
    @InputImport(name="objectId", required=true)
      private final Output<ObjectIdArgs> objectId;

    public Output<ObjectIdArgs> getObjectId() {
        return this.objectId;
    }

    /**
     * The value of this X.509 extension.
     * 
     */
    @InputImport(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public X509ExtensionArgs(
        Output<Boolean> critical,
        Output<ObjectIdArgs> objectId,
        Output<String> value) {
        this.critical = Objects.requireNonNull(critical, "expected parameter 'critical' to be non-null");
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private X509ExtensionArgs() {
        this.critical = Output.empty();
        this.objectId = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X509ExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> critical;
        private Output<ObjectIdArgs> objectId;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(X509ExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder critical(Output<Boolean> critical) {
            this.critical = Objects.requireNonNull(critical);
            return this;
        }

        public Builder critical(Boolean critical) {
            this.critical = Output.of(Objects.requireNonNull(critical));
            return this;
        }

        public Builder objectId(Output<ObjectIdArgs> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder objectId(ObjectIdArgs objectId) {
            this.objectId = Output.of(Objects.requireNonNull(objectId));
            return this;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }
        public X509ExtensionArgs build() {
            return new X509ExtensionArgs(critical, objectId, value);
        }
    }
}
