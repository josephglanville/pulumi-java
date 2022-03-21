// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamOpenXJsonSerDeArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamOpenXJsonSerDeArgs Empty = new DeliveryStreamOpenXJsonSerDeArgs();

    @Import(name="caseInsensitive")
      private final @Nullable Output<Boolean> caseInsensitive;

    public Output<Boolean> getCaseInsensitive() {
        return this.caseInsensitive == null ? Output.empty() : this.caseInsensitive;
    }

    @Import(name="columnToJsonKeyMappings")
      private final @Nullable Output<Object> columnToJsonKeyMappings;

    public Output<Object> getColumnToJsonKeyMappings() {
        return this.columnToJsonKeyMappings == null ? Output.empty() : this.columnToJsonKeyMappings;
    }

    @Import(name="convertDotsInJsonKeysToUnderscores")
      private final @Nullable Output<Boolean> convertDotsInJsonKeysToUnderscores;

    public Output<Boolean> getConvertDotsInJsonKeysToUnderscores() {
        return this.convertDotsInJsonKeysToUnderscores == null ? Output.empty() : this.convertDotsInJsonKeysToUnderscores;
    }

    public DeliveryStreamOpenXJsonSerDeArgs(
        @Nullable Output<Boolean> caseInsensitive,
        @Nullable Output<Object> columnToJsonKeyMappings,
        @Nullable Output<Boolean> convertDotsInJsonKeysToUnderscores) {
        this.caseInsensitive = caseInsensitive;
        this.columnToJsonKeyMappings = columnToJsonKeyMappings;
        this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
    }

    private DeliveryStreamOpenXJsonSerDeArgs() {
        this.caseInsensitive = Output.empty();
        this.columnToJsonKeyMappings = Output.empty();
        this.convertDotsInJsonKeysToUnderscores = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamOpenXJsonSerDeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> caseInsensitive;
        private @Nullable Output<Object> columnToJsonKeyMappings;
        private @Nullable Output<Boolean> convertDotsInJsonKeysToUnderscores;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamOpenXJsonSerDeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseInsensitive = defaults.caseInsensitive;
    	      this.columnToJsonKeyMappings = defaults.columnToJsonKeyMappings;
    	      this.convertDotsInJsonKeysToUnderscores = defaults.convertDotsInJsonKeysToUnderscores;
        }

        public Builder caseInsensitive(@Nullable Output<Boolean> caseInsensitive) {
            this.caseInsensitive = caseInsensitive;
            return this;
        }
        public Builder caseInsensitive(@Nullable Boolean caseInsensitive) {
            this.caseInsensitive = Output.ofNullable(caseInsensitive);
            return this;
        }
        public Builder columnToJsonKeyMappings(@Nullable Output<Object> columnToJsonKeyMappings) {
            this.columnToJsonKeyMappings = columnToJsonKeyMappings;
            return this;
        }
        public Builder columnToJsonKeyMappings(@Nullable Object columnToJsonKeyMappings) {
            this.columnToJsonKeyMappings = Output.ofNullable(columnToJsonKeyMappings);
            return this;
        }
        public Builder convertDotsInJsonKeysToUnderscores(@Nullable Output<Boolean> convertDotsInJsonKeysToUnderscores) {
            this.convertDotsInJsonKeysToUnderscores = convertDotsInJsonKeysToUnderscores;
            return this;
        }
        public Builder convertDotsInJsonKeysToUnderscores(@Nullable Boolean convertDotsInJsonKeysToUnderscores) {
            this.convertDotsInJsonKeysToUnderscores = Output.ofNullable(convertDotsInJsonKeysToUnderscores);
            return this;
        }        public DeliveryStreamOpenXJsonSerDeArgs build() {
            return new DeliveryStreamOpenXJsonSerDeArgs(caseInsensitive, columnToJsonKeyMappings, convertDotsInJsonKeysToUnderscores);
        }
    }
}
