// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.enums.JobEncryptionMode;
import io.pulumi.awsnative.databrew.enums.JobLogSubscription;
import io.pulumi.awsnative.databrew.outputs.JobDataCatalogOutput;
import io.pulumi.awsnative.databrew.outputs.JobDatabaseOutput;
import io.pulumi.awsnative.databrew.outputs.JobOutput;
import io.pulumi.awsnative.databrew.outputs.JobOutputLocation;
import io.pulumi.awsnative.databrew.outputs.JobProfileConfiguration;
import io.pulumi.awsnative.databrew.outputs.JobRecipe;
import io.pulumi.awsnative.databrew.outputs.JobSample;
import io.pulumi.awsnative.databrew.outputs.JobValidationConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobResult {
    private final @Nullable List<JobDataCatalogOutput> dataCatalogOutputs;
    private final @Nullable List<JobDatabaseOutput> databaseOutputs;
    /**
     * Dataset name
     * 
     */
    private final @Nullable String datasetName;
    /**
     * Encryption Key Arn
     * 
     */
    private final @Nullable String encryptionKeyArn;
    /**
     * Encryption mode
     * 
     */
    private final @Nullable JobEncryptionMode encryptionMode;
    /**
     * Job Sample
     * 
     */
    private final @Nullable JobSample jobSample;
    /**
     * Log subscription
     * 
     */
    private final @Nullable JobLogSubscription logSubscription;
    /**
     * Max capacity
     * 
     */
    private final @Nullable Integer maxCapacity;
    /**
     * Max retries
     * 
     */
    private final @Nullable Integer maxRetries;
    /**
     * Output location
     * 
     */
    private final @Nullable JobOutputLocation outputLocation;
    private final @Nullable List<JobOutput> outputs;
    /**
     * Profile Job configuration
     * 
     */
    private final @Nullable JobProfileConfiguration profileConfiguration;
    /**
     * Project name
     * 
     */
    private final @Nullable String projectName;
    private final @Nullable JobRecipe recipe;
    /**
     * Role arn
     * 
     */
    private final @Nullable String roleArn;
    /**
     * Timeout
     * 
     */
    private final @Nullable Integer timeout;
    /**
     * Data quality rules configuration
     * 
     */
    private final @Nullable List<JobValidationConfiguration> validationConfigurations;

    @CustomType.Constructor
    private GetJobResult(
        @CustomType.Parameter("dataCatalogOutputs") @Nullable List<JobDataCatalogOutput> dataCatalogOutputs,
        @CustomType.Parameter("databaseOutputs") @Nullable List<JobDatabaseOutput> databaseOutputs,
        @CustomType.Parameter("datasetName") @Nullable String datasetName,
        @CustomType.Parameter("encryptionKeyArn") @Nullable String encryptionKeyArn,
        @CustomType.Parameter("encryptionMode") @Nullable JobEncryptionMode encryptionMode,
        @CustomType.Parameter("jobSample") @Nullable JobSample jobSample,
        @CustomType.Parameter("logSubscription") @Nullable JobLogSubscription logSubscription,
        @CustomType.Parameter("maxCapacity") @Nullable Integer maxCapacity,
        @CustomType.Parameter("maxRetries") @Nullable Integer maxRetries,
        @CustomType.Parameter("outputLocation") @Nullable JobOutputLocation outputLocation,
        @CustomType.Parameter("outputs") @Nullable List<JobOutput> outputs,
        @CustomType.Parameter("profileConfiguration") @Nullable JobProfileConfiguration profileConfiguration,
        @CustomType.Parameter("projectName") @Nullable String projectName,
        @CustomType.Parameter("recipe") @Nullable JobRecipe recipe,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("timeout") @Nullable Integer timeout,
        @CustomType.Parameter("validationConfigurations") @Nullable List<JobValidationConfiguration> validationConfigurations) {
        this.dataCatalogOutputs = dataCatalogOutputs;
        this.databaseOutputs = databaseOutputs;
        this.datasetName = datasetName;
        this.encryptionKeyArn = encryptionKeyArn;
        this.encryptionMode = encryptionMode;
        this.jobSample = jobSample;
        this.logSubscription = logSubscription;
        this.maxCapacity = maxCapacity;
        this.maxRetries = maxRetries;
        this.outputLocation = outputLocation;
        this.outputs = outputs;
        this.profileConfiguration = profileConfiguration;
        this.projectName = projectName;
        this.recipe = recipe;
        this.roleArn = roleArn;
        this.timeout = timeout;
        this.validationConfigurations = validationConfigurations;
    }

    public List<JobDataCatalogOutput> getDataCatalogOutputs() {
        return this.dataCatalogOutputs == null ? List.of() : this.dataCatalogOutputs;
    }
    public List<JobDatabaseOutput> getDatabaseOutputs() {
        return this.databaseOutputs == null ? List.of() : this.databaseOutputs;
    }
    /**
     * Dataset name
     * 
    */
    public Optional<String> getDatasetName() {
        return Optional.ofNullable(this.datasetName);
    }
    /**
     * Encryption Key Arn
     * 
    */
    public Optional<String> getEncryptionKeyArn() {
        return Optional.ofNullable(this.encryptionKeyArn);
    }
    /**
     * Encryption mode
     * 
    */
    public Optional<JobEncryptionMode> getEncryptionMode() {
        return Optional.ofNullable(this.encryptionMode);
    }
    /**
     * Job Sample
     * 
    */
    public Optional<JobSample> getJobSample() {
        return Optional.ofNullable(this.jobSample);
    }
    /**
     * Log subscription
     * 
    */
    public Optional<JobLogSubscription> getLogSubscription() {
        return Optional.ofNullable(this.logSubscription);
    }
    /**
     * Max capacity
     * 
    */
    public Optional<Integer> getMaxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }
    /**
     * Max retries
     * 
    */
    public Optional<Integer> getMaxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }
    /**
     * Output location
     * 
    */
    public Optional<JobOutputLocation> getOutputLocation() {
        return Optional.ofNullable(this.outputLocation);
    }
    public List<JobOutput> getOutputs() {
        return this.outputs == null ? List.of() : this.outputs;
    }
    /**
     * Profile Job configuration
     * 
    */
    public Optional<JobProfileConfiguration> getProfileConfiguration() {
        return Optional.ofNullable(this.profileConfiguration);
    }
    /**
     * Project name
     * 
    */
    public Optional<String> getProjectName() {
        return Optional.ofNullable(this.projectName);
    }
    public Optional<JobRecipe> getRecipe() {
        return Optional.ofNullable(this.recipe);
    }
    /**
     * Role arn
     * 
    */
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    /**
     * Timeout
     * 
    */
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Data quality rules configuration
     * 
    */
    public List<JobValidationConfiguration> getValidationConfigurations() {
        return this.validationConfigurations == null ? List.of() : this.validationConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<JobDataCatalogOutput> dataCatalogOutputs;
        private @Nullable List<JobDatabaseOutput> databaseOutputs;
        private @Nullable String datasetName;
        private @Nullable String encryptionKeyArn;
        private @Nullable JobEncryptionMode encryptionMode;
        private @Nullable JobSample jobSample;
        private @Nullable JobLogSubscription logSubscription;
        private @Nullable Integer maxCapacity;
        private @Nullable Integer maxRetries;
        private @Nullable JobOutputLocation outputLocation;
        private @Nullable List<JobOutput> outputs;
        private @Nullable JobProfileConfiguration profileConfiguration;
        private @Nullable String projectName;
        private @Nullable JobRecipe recipe;
        private @Nullable String roleArn;
        private @Nullable Integer timeout;
        private @Nullable List<JobValidationConfiguration> validationConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogOutputs = defaults.dataCatalogOutputs;
    	      this.databaseOutputs = defaults.databaseOutputs;
    	      this.datasetName = defaults.datasetName;
    	      this.encryptionKeyArn = defaults.encryptionKeyArn;
    	      this.encryptionMode = defaults.encryptionMode;
    	      this.jobSample = defaults.jobSample;
    	      this.logSubscription = defaults.logSubscription;
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.maxRetries = defaults.maxRetries;
    	      this.outputLocation = defaults.outputLocation;
    	      this.outputs = defaults.outputs;
    	      this.profileConfiguration = defaults.profileConfiguration;
    	      this.projectName = defaults.projectName;
    	      this.recipe = defaults.recipe;
    	      this.roleArn = defaults.roleArn;
    	      this.timeout = defaults.timeout;
    	      this.validationConfigurations = defaults.validationConfigurations;
        }

        public Builder dataCatalogOutputs(@Nullable List<JobDataCatalogOutput> dataCatalogOutputs) {
            this.dataCatalogOutputs = dataCatalogOutputs;
            return this;
        }
        public Builder dataCatalogOutputs(JobDataCatalogOutput... dataCatalogOutputs) {
            return dataCatalogOutputs(List.of(dataCatalogOutputs));
        }
        public Builder databaseOutputs(@Nullable List<JobDatabaseOutput> databaseOutputs) {
            this.databaseOutputs = databaseOutputs;
            return this;
        }
        public Builder databaseOutputs(JobDatabaseOutput... databaseOutputs) {
            return databaseOutputs(List.of(databaseOutputs));
        }
        public Builder datasetName(@Nullable String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public Builder encryptionKeyArn(@Nullable String encryptionKeyArn) {
            this.encryptionKeyArn = encryptionKeyArn;
            return this;
        }
        public Builder encryptionMode(@Nullable JobEncryptionMode encryptionMode) {
            this.encryptionMode = encryptionMode;
            return this;
        }
        public Builder jobSample(@Nullable JobSample jobSample) {
            this.jobSample = jobSample;
            return this;
        }
        public Builder logSubscription(@Nullable JobLogSubscription logSubscription) {
            this.logSubscription = logSubscription;
            return this;
        }
        public Builder maxCapacity(@Nullable Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Builder maxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }
        public Builder outputLocation(@Nullable JobOutputLocation outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }
        public Builder outputs(@Nullable List<JobOutput> outputs) {
            this.outputs = outputs;
            return this;
        }
        public Builder outputs(JobOutput... outputs) {
            return outputs(List.of(outputs));
        }
        public Builder profileConfiguration(@Nullable JobProfileConfiguration profileConfiguration) {
            this.profileConfiguration = profileConfiguration;
            return this;
        }
        public Builder projectName(@Nullable String projectName) {
            this.projectName = projectName;
            return this;
        }
        public Builder recipe(@Nullable JobRecipe recipe) {
            this.recipe = recipe;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder validationConfigurations(@Nullable List<JobValidationConfiguration> validationConfigurations) {
            this.validationConfigurations = validationConfigurations;
            return this;
        }
        public Builder validationConfigurations(JobValidationConfiguration... validationConfigurations) {
            return validationConfigurations(List.of(validationConfigurations));
        }        public GetJobResult build() {
            return new GetJobResult(dataCatalogOutputs, databaseOutputs, datasetName, encryptionKeyArn, encryptionMode, jobSample, logSubscription, maxCapacity, maxRetries, outputLocation, outputs, profileConfiguration, projectName, recipe, roleArn, timeout, validationConfigurations);
        }
    }
}
