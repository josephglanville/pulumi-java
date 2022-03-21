// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.DataFlowResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.DataFlowSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.DataFlowSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.TransformationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MappingDataFlowResponse {
    /**
     * List of tags that can be used for describing the data flow.
     * 
     */
    private final @Nullable List<Object> annotations;
    /**
     * The description of the data flow.
     * 
     */
    private final @Nullable String description;
    /**
     * The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
     */
    private final @Nullable DataFlowResponseFolder folder;
    /**
     * DataFlow script.
     * 
     */
    private final @Nullable String script;
    /**
     * Data flow script lines.
     * 
     */
    private final @Nullable List<String> scriptLines;
    /**
     * List of sinks in data flow.
     * 
     */
    private final @Nullable List<DataFlowSinkResponse> sinks;
    /**
     * List of sources in data flow.
     * 
     */
    private final @Nullable List<DataFlowSourceResponse> sources;
    /**
     * List of transformations in data flow.
     * 
     */
    private final @Nullable List<TransformationResponse> transformations;
    /**
     * Type of data flow.
     * Expected value is 'MappingDataFlow'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private MappingDataFlowResponse(
        @CustomType.Parameter("annotations") @Nullable List<Object> annotations,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("folder") @Nullable DataFlowResponseFolder folder,
        @CustomType.Parameter("script") @Nullable String script,
        @CustomType.Parameter("scriptLines") @Nullable List<String> scriptLines,
        @CustomType.Parameter("sinks") @Nullable List<DataFlowSinkResponse> sinks,
        @CustomType.Parameter("sources") @Nullable List<DataFlowSourceResponse> sources,
        @CustomType.Parameter("transformations") @Nullable List<TransformationResponse> transformations,
        @CustomType.Parameter("type") String type) {
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.script = script;
        this.scriptLines = scriptLines;
        this.sinks = sinks;
        this.sources = sources;
        this.transformations = transformations;
        this.type = type;
    }

    /**
     * List of tags that can be used for describing the data flow.
     * 
    */
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    /**
     * The description of the data flow.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The folder that this data flow is in. If not specified, Data flow will appear at the root level.
     * 
    */
    public Optional<DataFlowResponseFolder> getFolder() {
        return Optional.ofNullable(this.folder);
    }
    /**
     * DataFlow script.
     * 
    */
    public Optional<String> getScript() {
        return Optional.ofNullable(this.script);
    }
    /**
     * Data flow script lines.
     * 
    */
    public List<String> getScriptLines() {
        return this.scriptLines == null ? List.of() : this.scriptLines;
    }
    /**
     * List of sinks in data flow.
     * 
    */
    public List<DataFlowSinkResponse> getSinks() {
        return this.sinks == null ? List.of() : this.sinks;
    }
    /**
     * List of sources in data flow.
     * 
    */
    public List<DataFlowSourceResponse> getSources() {
        return this.sources == null ? List.of() : this.sources;
    }
    /**
     * List of transformations in data flow.
     * 
    */
    public List<TransformationResponse> getTransformations() {
        return this.transformations == null ? List.of() : this.transformations;
    }
    /**
     * Type of data flow.
     * Expected value is 'MappingDataFlow'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MappingDataFlowResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Object> annotations;
        private @Nullable String description;
        private @Nullable DataFlowResponseFolder folder;
        private @Nullable String script;
        private @Nullable List<String> scriptLines;
        private @Nullable List<DataFlowSinkResponse> sinks;
        private @Nullable List<DataFlowSourceResponse> sources;
        private @Nullable List<TransformationResponse> transformations;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MappingDataFlowResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.description = defaults.description;
    	      this.folder = defaults.folder;
    	      this.script = defaults.script;
    	      this.scriptLines = defaults.scriptLines;
    	      this.sinks = defaults.sinks;
    	      this.sources = defaults.sources;
    	      this.transformations = defaults.transformations;
    	      this.type = defaults.type;
        }

        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder folder(@Nullable DataFlowResponseFolder folder) {
            this.folder = folder;
            return this;
        }
        public Builder script(@Nullable String script) {
            this.script = script;
            return this;
        }
        public Builder scriptLines(@Nullable List<String> scriptLines) {
            this.scriptLines = scriptLines;
            return this;
        }
        public Builder scriptLines(String... scriptLines) {
            return scriptLines(List.of(scriptLines));
        }
        public Builder sinks(@Nullable List<DataFlowSinkResponse> sinks) {
            this.sinks = sinks;
            return this;
        }
        public Builder sinks(DataFlowSinkResponse... sinks) {
            return sinks(List.of(sinks));
        }
        public Builder sources(@Nullable List<DataFlowSourceResponse> sources) {
            this.sources = sources;
            return this;
        }
        public Builder sources(DataFlowSourceResponse... sources) {
            return sources(List.of(sources));
        }
        public Builder transformations(@Nullable List<TransformationResponse> transformations) {
            this.transformations = transformations;
            return this;
        }
        public Builder transformations(TransformationResponse... transformations) {
            return transformations(List.of(transformations));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public MappingDataFlowResponse build() {
            return new MappingDataFlowResponse(annotations, description, folder, script, scriptLines, sinks, sources, transformations, type);
        }
    }
}
