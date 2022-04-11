// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firestore_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.firestore_v1beta1.enums.GoogleFirestoreAdminV1beta1IndexFieldMode;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A field of an index.
 * 
 */
public final class GoogleFirestoreAdminV1beta1IndexFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleFirestoreAdminV1beta1IndexFieldArgs Empty = new GoogleFirestoreAdminV1beta1IndexFieldArgs();

    /**
     * The path of the field. Must match the field path specification described by google.firestore.v1beta1.Document.fields. Special field path `__name__` may be used by itself or at the end of a path. `__type__` may be used only at the end of path.
     * 
     */
    @Import(name="fieldPath")
      private final @Nullable Output<String> fieldPath;

    public Output<String> getFieldPath() {
        return this.fieldPath == null ? Codegen.empty() : this.fieldPath;
    }

    /**
     * The field's mode.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<GoogleFirestoreAdminV1beta1IndexFieldMode> mode;

    public Output<GoogleFirestoreAdminV1beta1IndexFieldMode> getMode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    public GoogleFirestoreAdminV1beta1IndexFieldArgs(
        @Nullable Output<String> fieldPath,
        @Nullable Output<GoogleFirestoreAdminV1beta1IndexFieldMode> mode) {
        this.fieldPath = fieldPath;
        this.mode = mode;
    }

    private GoogleFirestoreAdminV1beta1IndexFieldArgs() {
        this.fieldPath = Codegen.empty();
        this.mode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleFirestoreAdminV1beta1IndexFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fieldPath;
        private @Nullable Output<GoogleFirestoreAdminV1beta1IndexFieldMode> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleFirestoreAdminV1beta1IndexFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldPath = defaults.fieldPath;
    	      this.mode = defaults.mode;
        }

        public Builder fieldPath(@Nullable Output<String> fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }
        public Builder fieldPath(@Nullable String fieldPath) {
            this.fieldPath = Codegen.ofNullable(fieldPath);
            return this;
        }
        public Builder mode(@Nullable Output<GoogleFirestoreAdminV1beta1IndexFieldMode> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable GoogleFirestoreAdminV1beta1IndexFieldMode mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }        public GoogleFirestoreAdminV1beta1IndexFieldArgs build() {
            return new GoogleFirestoreAdminV1beta1IndexFieldArgs(fieldPath, mode);
        }
    }
}
