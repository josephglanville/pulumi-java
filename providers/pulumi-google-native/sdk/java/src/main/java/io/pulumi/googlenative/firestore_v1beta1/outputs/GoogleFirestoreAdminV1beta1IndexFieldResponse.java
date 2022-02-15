// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firestore_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleFirestoreAdminV1beta1IndexFieldResponse {
    private final String fieldPath;
    private final String mode;

    @OutputCustomType.Constructor({"fieldPath","mode"})
    private GoogleFirestoreAdminV1beta1IndexFieldResponse(
        String fieldPath,
        String mode) {
        this.fieldPath = Objects.requireNonNull(fieldPath);
        this.mode = Objects.requireNonNull(mode);
    }

    public String getFieldPath() {
        return this.fieldPath;
    }
    public String getMode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleFirestoreAdminV1beta1IndexFieldResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fieldPath;
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleFirestoreAdminV1beta1IndexFieldResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldPath = defaults.fieldPath;
    	      this.mode = defaults.mode;
        }

        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = Objects.requireNonNull(fieldPath);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public GoogleFirestoreAdminV1beta1IndexFieldResponse build() {
            return new GoogleFirestoreAdminV1beta1IndexFieldResponse(fieldPath, mode);
        }
    }
}