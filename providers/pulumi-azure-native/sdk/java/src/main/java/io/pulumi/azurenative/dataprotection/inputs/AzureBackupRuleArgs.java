// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.AdhocBasedTriggerContextArgs;
import io.pulumi.azurenative.dataprotection.inputs.AzureBackupParamsArgs;
import io.pulumi.azurenative.dataprotection.inputs.DataStoreInfoBaseArgs;
import io.pulumi.azurenative.dataprotection.inputs.ScheduleBasedTriggerContextArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureBackupRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBackupRuleArgs Empty = new AzureBackupRuleArgs();

    @InputImport(name="backupParameters")
    private final @Nullable Input<AzureBackupParamsArgs> backupParameters;

    public Input<AzureBackupParamsArgs> getBackupParameters() {
        return this.backupParameters == null ? Input.empty() : this.backupParameters;
    }

    @InputImport(name="dataStore", required=true)
    private final Input<DataStoreInfoBaseArgs> dataStore;

    public Input<DataStoreInfoBaseArgs> getDataStore() {
        return this.dataStore;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="objectType", required=true)
    private final Input<String> objectType;

    public Input<String> getObjectType() {
        return this.objectType;
    }

    @InputImport(name="trigger", required=true)
    private final Input<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> trigger;

    public Input<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> getTrigger() {
        return this.trigger;
    }

    public AzureBackupRuleArgs(
        @Nullable Input<AzureBackupParamsArgs> backupParameters,
        Input<DataStoreInfoBaseArgs> dataStore,
        Input<String> name,
        Input<String> objectType,
        Input<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> trigger) {
        this.backupParameters = backupParameters;
        this.dataStore = Objects.requireNonNull(dataStore, "expected parameter 'dataStore' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.trigger = Objects.requireNonNull(trigger, "expected parameter 'trigger' to be non-null");
    }

    private AzureBackupRuleArgs() {
        this.backupParameters = Input.empty();
        this.dataStore = Input.empty();
        this.name = Input.empty();
        this.objectType = Input.empty();
        this.trigger = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBackupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AzureBackupParamsArgs> backupParameters;
        private Input<DataStoreInfoBaseArgs> dataStore;
        private Input<String> name;
        private Input<String> objectType;
        private Input<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> trigger;

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

        public Builder setBackupParameters(@Nullable Input<AzureBackupParamsArgs> backupParameters) {
            this.backupParameters = backupParameters;
            return this;
        }

        public Builder setBackupParameters(@Nullable AzureBackupParamsArgs backupParameters) {
            this.backupParameters = Input.ofNullable(backupParameters);
            return this;
        }

        public Builder setDataStore(Input<DataStoreInfoBaseArgs> dataStore) {
            this.dataStore = Objects.requireNonNull(dataStore);
            return this;
        }

        public Builder setDataStore(DataStoreInfoBaseArgs dataStore) {
            this.dataStore = Input.of(Objects.requireNonNull(dataStore));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setObjectType(Input<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Input.of(Objects.requireNonNull(objectType));
            return this;
        }

        public Builder setTrigger(Input<Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs>> trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }

        public Builder setTrigger(Either<AdhocBasedTriggerContextArgs,ScheduleBasedTriggerContextArgs> trigger) {
            this.trigger = Input.of(Objects.requireNonNull(trigger));
            return this;
        }

        public AzureBackupRuleArgs build() {
            return new AzureBackupRuleArgs(backupParameters, dataStore, name, objectType, trigger);
        }
    }
}
