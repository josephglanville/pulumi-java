// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalysisArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalysisArgs Empty = new AnalysisArgs();

    @Import(name="conversationId", required=true)
      private final Output<String> conversationId;

    public Output<String> getConversationId() {
        return this.conversationId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Immutable. The resource name of the analysis. Format: projects/{project}/locations/{location}/conversations/{conversation}/analyses/{analysis}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public AnalysisArgs(
        Output<String> conversationId,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.conversationId = Objects.requireNonNull(conversationId, "expected parameter 'conversationId' to be non-null");
        this.location = location;
        this.name = name;
        this.project = project;
    }

    private AnalysisArgs() {
        this.conversationId = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> conversationId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalysisArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationId = defaults.conversationId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder conversationId(Output<String> conversationId) {
            this.conversationId = Objects.requireNonNull(conversationId);
            return this;
        }
        public Builder conversationId(String conversationId) {
            this.conversationId = Output.of(Objects.requireNonNull(conversationId));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public AnalysisArgs build() {
            return new AnalysisArgs(conversationId, location, name, project);
        }
    }
}
