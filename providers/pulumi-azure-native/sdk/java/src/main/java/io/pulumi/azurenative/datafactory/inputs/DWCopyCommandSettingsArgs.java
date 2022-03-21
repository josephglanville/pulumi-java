// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.DWCopyCommandDefaultValueArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DW Copy Command settings.
 * 
 */
public final class DWCopyCommandSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DWCopyCommandSettingsArgs Empty = new DWCopyCommandSettingsArgs();

    /**
     * Additional options directly passed to SQL DW in Copy Command. Type: key value pairs (value should be string type) (or Expression with resultType object). Example: "additionalOptions": { "MAXERRORS": "1000", "DATEFORMAT": "'ymd'" }
     * 
     */
    @Import(name="additionalOptions")
      private final @Nullable Output<Map<String,String>> additionalOptions;

    public Output<Map<String,String>> getAdditionalOptions() {
        return this.additionalOptions == null ? Output.empty() : this.additionalOptions;
    }

    /**
     * Specifies the default values for each target column in SQL DW. The default values in the property overwrite the DEFAULT constraint set in the DB, and identity column cannot have a default value. Type: array of objects (or Expression with resultType array of objects).
     * 
     */
    @Import(name="defaultValues")
      private final @Nullable Output<List<DWCopyCommandDefaultValueArgs>> defaultValues;

    public Output<List<DWCopyCommandDefaultValueArgs>> getDefaultValues() {
        return this.defaultValues == null ? Output.empty() : this.defaultValues;
    }

    public DWCopyCommandSettingsArgs(
        @Nullable Output<Map<String,String>> additionalOptions,
        @Nullable Output<List<DWCopyCommandDefaultValueArgs>> defaultValues) {
        this.additionalOptions = additionalOptions;
        this.defaultValues = defaultValues;
    }

    private DWCopyCommandSettingsArgs() {
        this.additionalOptions = Output.empty();
        this.defaultValues = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DWCopyCommandSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> additionalOptions;
        private @Nullable Output<List<DWCopyCommandDefaultValueArgs>> defaultValues;

        public Builder() {
    	      // Empty
        }

        public Builder(DWCopyCommandSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalOptions = defaults.additionalOptions;
    	      this.defaultValues = defaults.defaultValues;
        }

        public Builder additionalOptions(@Nullable Output<Map<String,String>> additionalOptions) {
            this.additionalOptions = additionalOptions;
            return this;
        }
        public Builder additionalOptions(@Nullable Map<String,String> additionalOptions) {
            this.additionalOptions = Output.ofNullable(additionalOptions);
            return this;
        }
        public Builder defaultValues(@Nullable Output<List<DWCopyCommandDefaultValueArgs>> defaultValues) {
            this.defaultValues = defaultValues;
            return this;
        }
        public Builder defaultValues(@Nullable List<DWCopyCommandDefaultValueArgs> defaultValues) {
            this.defaultValues = Output.ofNullable(defaultValues);
            return this;
        }
        public Builder defaultValues(DWCopyCommandDefaultValueArgs... defaultValues) {
            return defaultValues(List.of(defaultValues));
        }        public DWCopyCommandSettingsArgs build() {
            return new DWCopyCommandSettingsArgs(additionalOptions, defaultValues);
        }
    }
}
