// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MigrationValidationOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrationValidationOptionsArgs Empty = new MigrationValidationOptionsArgs();

    @InputImport(name="enableDataIntegrityValidation")
    private final @Nullable Input<Boolean> enableDataIntegrityValidation;

    public Input<Boolean> getEnableDataIntegrityValidation() {
        return this.enableDataIntegrityValidation == null ? Input.empty() : this.enableDataIntegrityValidation;
    }

    @InputImport(name="enableQueryAnalysisValidation")
    private final @Nullable Input<Boolean> enableQueryAnalysisValidation;

    public Input<Boolean> getEnableQueryAnalysisValidation() {
        return this.enableQueryAnalysisValidation == null ? Input.empty() : this.enableQueryAnalysisValidation;
    }

    @InputImport(name="enableSchemaValidation")
    private final @Nullable Input<Boolean> enableSchemaValidation;

    public Input<Boolean> getEnableSchemaValidation() {
        return this.enableSchemaValidation == null ? Input.empty() : this.enableSchemaValidation;
    }

    public MigrationValidationOptionsArgs(
        @Nullable Input<Boolean> enableDataIntegrityValidation,
        @Nullable Input<Boolean> enableQueryAnalysisValidation,
        @Nullable Input<Boolean> enableSchemaValidation) {
        this.enableDataIntegrityValidation = enableDataIntegrityValidation;
        this.enableQueryAnalysisValidation = enableQueryAnalysisValidation;
        this.enableSchemaValidation = enableSchemaValidation;
    }

    private MigrationValidationOptionsArgs() {
        this.enableDataIntegrityValidation = Input.empty();
        this.enableQueryAnalysisValidation = Input.empty();
        this.enableSchemaValidation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationValidationOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableDataIntegrityValidation;
        private @Nullable Input<Boolean> enableQueryAnalysisValidation;
        private @Nullable Input<Boolean> enableSchemaValidation;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationValidationOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDataIntegrityValidation = defaults.enableDataIntegrityValidation;
    	      this.enableQueryAnalysisValidation = defaults.enableQueryAnalysisValidation;
    	      this.enableSchemaValidation = defaults.enableSchemaValidation;
        }

        public Builder setEnableDataIntegrityValidation(@Nullable Input<Boolean> enableDataIntegrityValidation) {
            this.enableDataIntegrityValidation = enableDataIntegrityValidation;
            return this;
        }

        public Builder setEnableDataIntegrityValidation(@Nullable Boolean enableDataIntegrityValidation) {
            this.enableDataIntegrityValidation = Input.ofNullable(enableDataIntegrityValidation);
            return this;
        }

        public Builder setEnableQueryAnalysisValidation(@Nullable Input<Boolean> enableQueryAnalysisValidation) {
            this.enableQueryAnalysisValidation = enableQueryAnalysisValidation;
            return this;
        }

        public Builder setEnableQueryAnalysisValidation(@Nullable Boolean enableQueryAnalysisValidation) {
            this.enableQueryAnalysisValidation = Input.ofNullable(enableQueryAnalysisValidation);
            return this;
        }

        public Builder setEnableSchemaValidation(@Nullable Input<Boolean> enableSchemaValidation) {
            this.enableSchemaValidation = enableSchemaValidation;
            return this;
        }

        public Builder setEnableSchemaValidation(@Nullable Boolean enableSchemaValidation) {
            this.enableSchemaValidation = Input.ofNullable(enableSchemaValidation);
            return this;
        }

        public MigrationValidationOptionsArgs build() {
            return new MigrationValidationOptionsArgs(enableDataIntegrityValidation, enableQueryAnalysisValidation, enableSchemaValidation);
        }
    }
}
