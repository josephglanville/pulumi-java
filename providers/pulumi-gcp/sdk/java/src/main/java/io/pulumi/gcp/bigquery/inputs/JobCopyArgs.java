// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.bigquery.inputs.JobCopyDestinationEncryptionConfigurationArgs;
import io.pulumi.gcp.bigquery.inputs.JobCopyDestinationTableArgs;
import io.pulumi.gcp.bigquery.inputs.JobCopySourceTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobCopyArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobCopyArgs Empty = new JobCopyArgs();

    /**
     * Specifies whether the job is allowed to create new tables. The following values are supported:
     * CREATE_IF_NEEDED: If the table does not exist, BigQuery creates the table.
     * CREATE_NEVER: The table must already exist. If it does not, a 'notFound' error is returned in the job result.
     * Creation, truncation and append actions occur as one atomic update upon job completion
     * Default value is `CREATE_IF_NEEDED`.
     * Possible values are `CREATE_IF_NEEDED` and `CREATE_NEVER`.
     * 
     */
    @InputImport(name="createDisposition")
      private final @Nullable Input<String> createDisposition;

    public Input<String> getCreateDisposition() {
        return this.createDisposition == null ? Input.empty() : this.createDisposition;
    }

    /**
     * Custom encryption configuration (e.g., Cloud KMS keys)
     * Structure is documented below.
     * 
     */
    @InputImport(name="destinationEncryptionConfiguration")
      private final @Nullable Input<JobCopyDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration;

    public Input<JobCopyDestinationEncryptionConfigurationArgs> getDestinationEncryptionConfiguration() {
        return this.destinationEncryptionConfiguration == null ? Input.empty() : this.destinationEncryptionConfiguration;
    }

    /**
     * The destination table.
     * Structure is documented below.
     * 
     */
    @InputImport(name="destinationTable")
      private final @Nullable Input<JobCopyDestinationTableArgs> destinationTable;

    public Input<JobCopyDestinationTableArgs> getDestinationTable() {
        return this.destinationTable == null ? Input.empty() : this.destinationTable;
    }

    /**
     * Source tables to copy.
     * Structure is documented below.
     * 
     */
    @InputImport(name="sourceTables", required=true)
      private final Input<List<JobCopySourceTableArgs>> sourceTables;

    public Input<List<JobCopySourceTableArgs>> getSourceTables() {
        return this.sourceTables;
    }

    /**
     * Specifies the action that occurs if the destination table already exists. The following values are supported:
     * WRITE_TRUNCATE: If the table already exists, BigQuery overwrites the table data and uses the schema from the query result.
     * WRITE_APPEND: If the table already exists, BigQuery appends the data to the table.
     * WRITE_EMPTY: If the table already exists and contains data, a 'duplicate' error is returned in the job result.
     * Each action is atomic and only occurs if BigQuery is able to complete the job successfully.
     * Creation, truncation and append actions occur as one atomic update upon job completion.
     * Default value is `WRITE_EMPTY`.
     * Possible values are `WRITE_TRUNCATE`, `WRITE_APPEND`, and `WRITE_EMPTY`.
     * 
     */
    @InputImport(name="writeDisposition")
      private final @Nullable Input<String> writeDisposition;

    public Input<String> getWriteDisposition() {
        return this.writeDisposition == null ? Input.empty() : this.writeDisposition;
    }

    public JobCopyArgs(
        @Nullable Input<String> createDisposition,
        @Nullable Input<JobCopyDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration,
        @Nullable Input<JobCopyDestinationTableArgs> destinationTable,
        Input<List<JobCopySourceTableArgs>> sourceTables,
        @Nullable Input<String> writeDisposition) {
        this.createDisposition = createDisposition;
        this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
        this.destinationTable = destinationTable;
        this.sourceTables = Objects.requireNonNull(sourceTables, "expected parameter 'sourceTables' to be non-null");
        this.writeDisposition = writeDisposition;
    }

    private JobCopyArgs() {
        this.createDisposition = Input.empty();
        this.destinationEncryptionConfiguration = Input.empty();
        this.destinationTable = Input.empty();
        this.sourceTables = Input.empty();
        this.writeDisposition = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCopyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createDisposition;
        private @Nullable Input<JobCopyDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration;
        private @Nullable Input<JobCopyDestinationTableArgs> destinationTable;
        private Input<List<JobCopySourceTableArgs>> sourceTables;
        private @Nullable Input<String> writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCopyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createDisposition = defaults.createDisposition;
    	      this.destinationEncryptionConfiguration = defaults.destinationEncryptionConfiguration;
    	      this.destinationTable = defaults.destinationTable;
    	      this.sourceTables = defaults.sourceTables;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder setCreateDisposition(@Nullable Input<String> createDisposition) {
            this.createDisposition = createDisposition;
            return this;
        }

        public Builder setCreateDisposition(@Nullable String createDisposition) {
            this.createDisposition = Input.ofNullable(createDisposition);
            return this;
        }

        public Builder setDestinationEncryptionConfiguration(@Nullable Input<JobCopyDestinationEncryptionConfigurationArgs> destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = destinationEncryptionConfiguration;
            return this;
        }

        public Builder setDestinationEncryptionConfiguration(@Nullable JobCopyDestinationEncryptionConfigurationArgs destinationEncryptionConfiguration) {
            this.destinationEncryptionConfiguration = Input.ofNullable(destinationEncryptionConfiguration);
            return this;
        }

        public Builder setDestinationTable(@Nullable Input<JobCopyDestinationTableArgs> destinationTable) {
            this.destinationTable = destinationTable;
            return this;
        }

        public Builder setDestinationTable(@Nullable JobCopyDestinationTableArgs destinationTable) {
            this.destinationTable = Input.ofNullable(destinationTable);
            return this;
        }

        public Builder setSourceTables(Input<List<JobCopySourceTableArgs>> sourceTables) {
            this.sourceTables = Objects.requireNonNull(sourceTables);
            return this;
        }

        public Builder setSourceTables(List<JobCopySourceTableArgs> sourceTables) {
            this.sourceTables = Input.of(Objects.requireNonNull(sourceTables));
            return this;
        }

        public Builder setWriteDisposition(@Nullable Input<String> writeDisposition) {
            this.writeDisposition = writeDisposition;
            return this;
        }

        public Builder setWriteDisposition(@Nullable String writeDisposition) {
            this.writeDisposition = Input.ofNullable(writeDisposition);
            return this;
        }
        public JobCopyArgs build() {
            return new JobCopyArgs(createDisposition, destinationEncryptionConfiguration, destinationTable, sourceTables, writeDisposition);
        }
    }
}
