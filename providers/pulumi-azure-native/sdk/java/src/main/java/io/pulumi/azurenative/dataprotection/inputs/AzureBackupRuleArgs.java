// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.AdhocBasedTriggerContextArgs;
import io.pulumi.azurenative.dataprotection.inputs.AzureBackupParamsArgs;
import io.pulumi.azurenative.dataprotection.inputs.DataStoreInfoBaseArgs;
import io.pulumi.azurenative.dataprotection.inputs.ScheduleBasedTriggerContextArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure backup rule
 * 
 */
public final class AzureBackupRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBackupRuleArgs Empty = new AzureBackupRuleArgs();

    /**
     * BackupParameters base
     * 
     */
    @Import(name="backupParameters")
      private final @Nullable Output<AzureBackupParamsArgs> backupParameters;

    public Output<AzureBackupParamsArgs> getBackupParameters() {
        return this.backupParameters == null ? Output.empty() : this.backupParameters;
    }

    /**
     * DataStoreInfo base
     * 
     */
    @Import(name="dataStore", required=true)
      private final Output<DataStoreInfoBaseArgs> dataStore;

    public Output<DataStoreInfoBaseArgs> getDataStore() {
        return this.dataStore;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Expected value is 'AzureBackupRule'.
     * 
     */
    @Import(name="objectType", required=true)
      private final Output<String> objectType;

    public Output<String> getObjectType() {
        return this.objectType;
    }

    /**
     * Trigger context
     * 
     */
    @Import(name="trigger", required=true)
      private final Output<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> trigger;

    public Output<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> getTrigger() {
        return this.trigger;
    }

    public AzureBackupRuleArgs(
        @Nullable Output<AzureBackupParamsArgs> backupParameters,
        Output<DataStoreInfoBaseArgs> dataStore,
        Output<String> name,
        Output<String> objectType,
        Output<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> trigger) {
        this.backupParameters = backupParameters;
        this.dataStore = Objects.requireNonNull(dataStore, "expected parameter 'dataStore' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.trigger = Objects.requireNonNull(trigger, "expected parameter 'trigger' to be non-null");
    }

    private AzureBackupRuleArgs() {
        this.backupParameters = Output.empty();
        this.dataStore = Output.empty();
        this.name = Output.empty();
        this.objectType = Output.empty();
        this.trigger = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBackupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AzureBackupParamsArgs> backupParameters;
        private Output<DataStoreInfoBaseArgs> dataStore;
        private Output<String> name;
        private Output<String> objectType;
        private Output<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBackupRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupParameters = defaults.backupParameters;
    	      this.dataStore = defaults.dataStore;
    	      this.name = defaults.name;
    	      this.objectType = defaults.objectType;
    	      this.trigger = defaults.trigger;
        }

        public Builder backupParameters(@Nullable Output<AzureBackupParamsArgs> backupParameters) {
            this.backupParameters = backupParameters;
            return this;
        }
        public Builder backupParameters(@Nullable AzureBackupParamsArgs backupParameters) {
            this.backupParameters = Output.ofNullable(backupParameters);
            return this;
        }
        public Builder dataStore(Output<DataStoreInfoBaseArgs> dataStore) {
            this.dataStore = Objects.requireNonNull(dataStore);
            return this;
        }
        public Builder dataStore(DataStoreInfoBaseArgs dataStore) {
            this.dataStore = Output.of(Objects.requireNonNull(dataStore));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder objectType(Output<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Output.of(Objects.requireNonNull(objectType));
            return this;
        }
        public Builder trigger(Output<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }
        public Builder trigger(Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs> trigger) {
            this.trigger = Output.of(Objects.requireNonNull(trigger));
            return this;
        }        public AzureBackupRuleArgs build() {
            return new AzureBackupRuleArgs(backupParameters, dataStore, name, objectType, trigger);
        }
    }
}
