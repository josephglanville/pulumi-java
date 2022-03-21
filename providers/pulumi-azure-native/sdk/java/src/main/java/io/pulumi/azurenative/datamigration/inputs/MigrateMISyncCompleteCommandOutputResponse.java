// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Output for command that completes online migration for an Azure SQL Database Managed Instance.
 * 
 */
public final class MigrateMISyncCompleteCommandOutputResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateMISyncCompleteCommandOutputResponse Empty = new MigrateMISyncCompleteCommandOutputResponse();

    /**
     * List of errors that happened during the command execution
     * 
     */
    @Import(name="errors")
      private final @Nullable List<ReportableExceptionResponse> errors;

    public List<ReportableExceptionResponse> getErrors() {
        return this.errors == null ? List.of() : this.errors;
    }

    public MigrateMISyncCompleteCommandOutputResponse(@Nullable List<ReportableExceptionResponse> errors) {
        this.errors = errors;
    }

    private MigrateMISyncCompleteCommandOutputResponse() {
        this.errors = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateMISyncCompleteCommandOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ReportableExceptionResponse> errors;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateMISyncCompleteCommandOutputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
        }

        public Builder errors(@Nullable List<ReportableExceptionResponse> errors) {
            this.errors = errors;
            return this;
        }
        public Builder errors(ReportableExceptionResponse... errors) {
            return errors(List.of(errors));
        }        public MigrateMISyncCompleteCommandOutputResponse build() {
            return new MigrateMISyncCompleteCommandOutputResponse(errors);
        }
    }
}
