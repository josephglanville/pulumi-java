// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateTemplatePredefinedValuesAdditionalExtensionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePredefinedValuesAdditionalExtensionArgs Empty = new CertificateTemplatePredefinedValuesAdditionalExtensionArgs();

    @InputImport(name="critical")
    private final @Nullable Input<Boolean> critical;

    public Input<Boolean> getCritical() {
        return this.critical == null ? Input.empty() : this.critical;
    }

    @InputImport(name="objectId", required=true)
    private final Input<CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs> objectId;

    public Input<CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs> getObjectId() {
        return this.objectId;
    }

    @InputImport(name="value", required=true)
    private final Input<String> value;

    public Input<String> getValue() {
        return this.value;
    }

    public CertificateTemplatePredefinedValuesAdditionalExtensionArgs(
        @Nullable Input<Boolean> critical,
        Input<CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs> objectId,
        Input<String> value) {
        this.critical = critical;
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private CertificateTemplatePredefinedValuesAdditionalExtensionArgs() {
        this.critical = Input.empty();
        this.objectId = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplatePredefinedValuesAdditionalExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> critical;
        private Input<CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs> objectId;
        private Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplatePredefinedValuesAdditionalExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.critical = defaults.critical;
    	      this.objectId = defaults.objectId;
    	      this.value = defaults.value;
        }

        public Builder setCritical(@Nullable Input<Boolean> critical) {
            this.critical = critical;
            return this;
        }

        public Builder setCritical(@Nullable Boolean critical) {
            this.critical = Input.ofNullable(critical);
            return this;
        }

        public Builder setObjectId(Input<CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setObjectId(CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdArgs objectId) {
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

        public CertificateTemplatePredefinedValuesAdditionalExtensionArgs build() {
            return new CertificateTemplatePredefinedValuesAdditionalExtensionArgs(critical, objectId, value);
        }
    }
}