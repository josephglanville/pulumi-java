// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoveryreadiness.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CellState extends io.pulumi.resources.ResourceArgs {

    public static final CellState Empty = new CellState();

    /**
     * ARN of the cell
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Unique name describing the cell.
     * 
     */
    @Import(name="cellName")
      private final @Nullable Output<String> cellName;

    public Output<String> getCellName() {
        return this.cellName == null ? Output.empty() : this.cellName;
    }

    /**
     * List of cell arns to add as nested fault domains within this cell.
     * 
     */
    @Import(name="cells")
      private final @Nullable Output<List<String>> cells;

    public Output<List<String>> getCells() {
        return this.cells == null ? Output.empty() : this.cells;
    }

    /**
     * List of readiness scopes (recovery groups or cells) that contain this cell.
     * 
     */
    @Import(name="parentReadinessScopes")
      private final @Nullable Output<List<String>> parentReadinessScopes;

    public Output<List<String>> getParentReadinessScopes() {
        return this.parentReadinessScopes == null ? Output.empty() : this.parentReadinessScopes;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public CellState(
        @Nullable Output<String> arn,
        @Nullable Output<String> cellName,
        @Nullable Output<List<String>> cells,
        @Nullable Output<List<String>> parentReadinessScopes,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.cellName = cellName;
        this.cells = cells;
        this.parentReadinessScopes = parentReadinessScopes;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private CellState() {
        this.arn = Output.empty();
        this.cellName = Output.empty();
        this.cells = Output.empty();
        this.parentReadinessScopes = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CellState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> cellName;
        private @Nullable Output<List<String>> cells;
        private @Nullable Output<List<String>> parentReadinessScopes;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(CellState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cellName = defaults.cellName;
    	      this.cells = defaults.cells;
    	      this.parentReadinessScopes = defaults.parentReadinessScopes;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder cellName(@Nullable Output<String> cellName) {
            this.cellName = cellName;
            return this;
        }
        public Builder cellName(@Nullable String cellName) {
            this.cellName = Output.ofNullable(cellName);
            return this;
        }
        public Builder cells(@Nullable Output<List<String>> cells) {
            this.cells = cells;
            return this;
        }
        public Builder cells(@Nullable List<String> cells) {
            this.cells = Output.ofNullable(cells);
            return this;
        }
        public Builder cells(String... cells) {
            return cells(List.of(cells));
        }
        public Builder parentReadinessScopes(@Nullable Output<List<String>> parentReadinessScopes) {
            this.parentReadinessScopes = parentReadinessScopes;
            return this;
        }
        public Builder parentReadinessScopes(@Nullable List<String> parentReadinessScopes) {
            this.parentReadinessScopes = Output.ofNullable(parentReadinessScopes);
            return this;
        }
        public Builder parentReadinessScopes(String... parentReadinessScopes) {
            return parentReadinessScopes(List.of(parentReadinessScopes));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public CellState build() {
            return new CellState(arn, cellName, cells, parentReadinessScopes, tags, tagsAll);
        }
    }
}
