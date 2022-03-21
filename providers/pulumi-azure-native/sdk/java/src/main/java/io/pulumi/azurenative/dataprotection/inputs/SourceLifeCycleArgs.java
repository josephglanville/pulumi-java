// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.AbsoluteDeleteOptionArgs;
import io.pulumi.azurenative.dataprotection.inputs.DataStoreInfoBaseArgs;
import io.pulumi.azurenative.dataprotection.inputs.TargetCopySettingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Source LifeCycle
 * 
 */
public final class SourceLifeCycleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceLifeCycleArgs Empty = new SourceLifeCycleArgs();

    /**
     * Delete Option
     * 
     */
    @Import(name="deleteAfter", required=true)
      private final Output<AbsoluteDeleteOptionArgs> deleteAfter;

    public Output<AbsoluteDeleteOptionArgs> getDeleteAfter() {
        return this.deleteAfter;
    }

    /**
     * DataStoreInfo base
     * 
     */
    @Import(name="sourceDataStore", required=true)
      private final Output<DataStoreInfoBaseArgs> sourceDataStore;

    public Output<DataStoreInfoBaseArgs> getSourceDataStore() {
        return this.sourceDataStore;
    }

    @Import(name="targetDataStoreCopySettings")
      private final @Nullable Output<List<TargetCopySettingArgs>> targetDataStoreCopySettings;

    public Output<List<TargetCopySettingArgs>> getTargetDataStoreCopySettings() {
        return this.targetDataStoreCopySettings == null ? Output.empty() : this.targetDataStoreCopySettings;
    }

    public SourceLifeCycleArgs(
        Output<AbsoluteDeleteOptionArgs> deleteAfter,
        Output<DataStoreInfoBaseArgs> sourceDataStore,
        @Nullable Output<List<TargetCopySettingArgs>> targetDataStoreCopySettings) {
        this.deleteAfter = Objects.requireNonNull(deleteAfter, "expected parameter 'deleteAfter' to be non-null");
        this.sourceDataStore = Objects.requireNonNull(sourceDataStore, "expected parameter 'sourceDataStore' to be non-null");
        this.targetDataStoreCopySettings = targetDataStoreCopySettings;
    }

    private SourceLifeCycleArgs() {
        this.deleteAfter = Output.empty();
        this.sourceDataStore = Output.empty();
        this.targetDataStoreCopySettings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceLifeCycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AbsoluteDeleteOptionArgs> deleteAfter;
        private Output<DataStoreInfoBaseArgs> sourceDataStore;
        private @Nullable Output<List<TargetCopySettingArgs>> targetDataStoreCopySettings;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceLifeCycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteAfter = defaults.deleteAfter;
    	      this.sourceDataStore = defaults.sourceDataStore;
    	      this.targetDataStoreCopySettings = defaults.targetDataStoreCopySettings;
        }

        public Builder deleteAfter(Output<AbsoluteDeleteOptionArgs> deleteAfter) {
            this.deleteAfter = Objects.requireNonNull(deleteAfter);
            return this;
        }
        public Builder deleteAfter(AbsoluteDeleteOptionArgs deleteAfter) {
            this.deleteAfter = Output.of(Objects.requireNonNull(deleteAfter));
            return this;
        }
        public Builder sourceDataStore(Output<DataStoreInfoBaseArgs> sourceDataStore) {
            this.sourceDataStore = Objects.requireNonNull(sourceDataStore);
            return this;
        }
        public Builder sourceDataStore(DataStoreInfoBaseArgs sourceDataStore) {
            this.sourceDataStore = Output.of(Objects.requireNonNull(sourceDataStore));
            return this;
        }
        public Builder targetDataStoreCopySettings(@Nullable Output<List<TargetCopySettingArgs>> targetDataStoreCopySettings) {
            this.targetDataStoreCopySettings = targetDataStoreCopySettings;
            return this;
        }
        public Builder targetDataStoreCopySettings(@Nullable List<TargetCopySettingArgs> targetDataStoreCopySettings) {
            this.targetDataStoreCopySettings = Output.ofNullable(targetDataStoreCopySettings);
            return this;
        }
        public Builder targetDataStoreCopySettings(TargetCopySettingArgs... targetDataStoreCopySettings) {
            return targetDataStoreCopySettings(List.of(targetDataStoreCopySettings));
        }        public SourceLifeCycleArgs build() {
            return new SourceLifeCycleArgs(deleteAfter, sourceDataStore, targetDataStoreCopySettings);
        }
    }
}
