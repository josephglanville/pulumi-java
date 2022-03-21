// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firestore_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A field of an index.
 * 
 */
public final class GoogleFirestoreAdminV1beta1IndexFieldResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleFirestoreAdminV1beta1IndexFieldResponse Empty = new GoogleFirestoreAdminV1beta1IndexFieldResponse();

    /**
     * The path of the field. Must match the field path specification described by google.firestore.v1beta1.Document.fields. Special field path `__name__` may be used by itself or at the end of a path. `__type__` may be used only at the end of path.
     * 
     */
    @Import(name="fieldPath", required=true)
      private final String fieldPath;

    public String getFieldPath() {
        return this.fieldPath;
    }

    /**
     * The field's mode.
     * 
     */
    @Import(name="mode", required=true)
      private final String mode;

    public String getMode() {
        return this.mode;
    }

    public GoogleFirestoreAdminV1beta1IndexFieldResponse(
        String fieldPath,
        String mode) {
        this.fieldPath = Objects.requireNonNull(fieldPath, "expected parameter 'fieldPath' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
    }

    private GoogleFirestoreAdminV1beta1IndexFieldResponse() {
        this.fieldPath = null;
        this.mode = null;
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

        public Builder fieldPath(String fieldPath) {
            this.fieldPath = Objects.requireNonNull(fieldPath);
            return this;
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }        public GoogleFirestoreAdminV1beta1IndexFieldResponse build() {
            return new GoogleFirestoreAdminV1beta1IndexFieldResponse(fieldPath, mode);
        }
    }
}
