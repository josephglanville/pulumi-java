// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.DataFlowResponseFolder;
import io.pulumi.azurenative.datafactory.outputs.DataFlowSinkResponse;
import io.pulumi.azurenative.datafactory.outputs.DataFlowSourceResponse;
import io.pulumi.azurenative.datafactory.outputs.TransformationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowletResponse {
    private final @Nullable List<Object> annotations;
    private final @Nullable String description;
    private final @Nullable DataFlowResponseFolder folder;
    private final @Nullable String script;
    private final @Nullable List<String> scriptLines;
    private final @Nullable List<DataFlowSinkResponse> sinks;
    private final @Nullable List<DataFlowSourceResponse> sources;
    private final @Nullable List<TransformationResponse> transformations;
    private final String type;

    @OutputCustomType.Constructor({"annotations","description","folder","script","scriptLines","sinks","sources","transformations","type"})
    private FlowletResponse(
        @Nullable List<Object> annotations,
        @Nullable String description,
        @Nullable DataFlowResponseFolder folder,
        @Nullable String script,
        @Nullable List<String> scriptLines,
        @Nullable List<DataFlowSinkResponse> sinks,
        @Nullable List<DataFlowSourceResponse> sources,
        @Nullable List<TransformationResponse> transformations,
        String type) {
        this.annotations = annotations;
        this.description = description;
        this.folder = folder;
        this.script = script;
        this.scriptLines = scriptLines;
        this.sinks = sinks;
        this.sources = sources;
        this.transformations = transformations;
        this.type = Objects.requireNonNull(type);
    }

    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<DataFlowResponseFolder> getFolder() {
        return Optional.ofNullable(this.folder);
    }
    public Optional<String> getScript() {
        return Optional.ofNullable(this.script);
    }
    public List<String> getScriptLines() {
        return this.scriptLines == null ? List.of() : this.scriptLines;
    }
    public List<DataFlowSinkResponse> getSinks() {
        return this.sinks == null ? List.of() : this.sinks;
    }
    public List<DataFlowSourceResponse> getSources() {
        return this.sources == null ? List.of() : this.sources;
    }
    public List<TransformationResponse> getTransformations() {
        return this.transformations == null ? List.of() : this.transformations;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowletResponse defaults) {
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

        public Builder(FlowletResponse defaults) {
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

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFolder(@Nullable DataFlowResponseFolder folder) {
            this.folder = folder;
            return this;
        }

        public Builder setScript(@Nullable String script) {
            this.script = script;
            return this;
        }

        public Builder setScriptLines(@Nullable List<String> scriptLines) {
            this.scriptLines = scriptLines;
            return this;
        }

        public Builder setSinks(@Nullable List<DataFlowSinkResponse> sinks) {
            this.sinks = sinks;
            return this;
        }

        public Builder setSources(@Nullable List<DataFlowSourceResponse> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setTransformations(@Nullable List<TransformationResponse> transformations) {
            this.transformations = transformations;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public FlowletResponse build() {
            return new FlowletResponse(annotations, description, folder, script, scriptLines, sinks, sources, transformations, type);
        }
    }
}
