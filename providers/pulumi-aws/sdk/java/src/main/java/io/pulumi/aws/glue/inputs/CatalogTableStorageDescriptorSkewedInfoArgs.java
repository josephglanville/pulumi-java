// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CatalogTableStorageDescriptorSkewedInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogTableStorageDescriptorSkewedInfoArgs Empty = new CatalogTableStorageDescriptorSkewedInfoArgs();

    /**
     * List of names of columns that contain skewed values.
     * 
     */
    @Import(name="skewedColumnNames")
      private final @Nullable Output<List<String>> skewedColumnNames;

    public Output<List<String>> getSkewedColumnNames() {
        return this.skewedColumnNames == null ? Codegen.empty() : this.skewedColumnNames;
    }

    /**
     * List of values that appear so frequently as to be considered skewed.
     * 
     */
    @Import(name="skewedColumnValueLocationMaps")
      private final @Nullable Output<Map<String,String>> skewedColumnValueLocationMaps;

    public Output<Map<String,String>> getSkewedColumnValueLocationMaps() {
        return this.skewedColumnValueLocationMaps == null ? Codegen.empty() : this.skewedColumnValueLocationMaps;
    }

    /**
     * Map of skewed values to the columns that contain them.
     * 
     */
    @Import(name="skewedColumnValues")
      private final @Nullable Output<List<String>> skewedColumnValues;

    public Output<List<String>> getSkewedColumnValues() {
        return this.skewedColumnValues == null ? Codegen.empty() : this.skewedColumnValues;
    }

    public CatalogTableStorageDescriptorSkewedInfoArgs(
        @Nullable Output<List<String>> skewedColumnNames,
        @Nullable Output<Map<String,String>> skewedColumnValueLocationMaps,
        @Nullable Output<List<String>> skewedColumnValues) {
        this.skewedColumnNames = skewedColumnNames;
        this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
        this.skewedColumnValues = skewedColumnValues;
    }

    private CatalogTableStorageDescriptorSkewedInfoArgs() {
        this.skewedColumnNames = Codegen.empty();
        this.skewedColumnValueLocationMaps = Codegen.empty();
        this.skewedColumnValues = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSkewedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> skewedColumnNames;
        private @Nullable Output<Map<String,String>> skewedColumnValueLocationMaps;
        private @Nullable Output<List<String>> skewedColumnValues;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorSkewedInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skewedColumnNames = defaults.skewedColumnNames;
    	      this.skewedColumnValueLocationMaps = defaults.skewedColumnValueLocationMaps;
    	      this.skewedColumnValues = defaults.skewedColumnValues;
        }

        public Builder skewedColumnNames(@Nullable Output<List<String>> skewedColumnNames) {
            this.skewedColumnNames = skewedColumnNames;
            return this;
        }
        public Builder skewedColumnNames(@Nullable List<String> skewedColumnNames) {
            this.skewedColumnNames = Codegen.ofNullable(skewedColumnNames);
            return this;
        }
        public Builder skewedColumnNames(String... skewedColumnNames) {
            return skewedColumnNames(List.of(skewedColumnNames));
        }
        public Builder skewedColumnValueLocationMaps(@Nullable Output<Map<String,String>> skewedColumnValueLocationMaps) {
            this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
            return this;
        }
        public Builder skewedColumnValueLocationMaps(@Nullable Map<String,String> skewedColumnValueLocationMaps) {
            this.skewedColumnValueLocationMaps = Codegen.ofNullable(skewedColumnValueLocationMaps);
            return this;
        }
        public Builder skewedColumnValues(@Nullable Output<List<String>> skewedColumnValues) {
            this.skewedColumnValues = skewedColumnValues;
            return this;
        }
        public Builder skewedColumnValues(@Nullable List<String> skewedColumnValues) {
            this.skewedColumnValues = Codegen.ofNullable(skewedColumnValues);
            return this;
        }
        public Builder skewedColumnValues(String... skewedColumnValues) {
            return skewedColumnValues(List.of(skewedColumnValues));
        }        public CatalogTableStorageDescriptorSkewedInfoArgs build() {
            return new CatalogTableStorageDescriptorSkewedInfoArgs(skewedColumnNames, skewedColumnValueLocationMaps, skewedColumnValues);
        }
    }
}
