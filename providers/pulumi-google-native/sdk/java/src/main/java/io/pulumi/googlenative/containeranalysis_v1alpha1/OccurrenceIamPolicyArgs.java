// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.BindingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OccurrenceIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final OccurrenceIamPolicyArgs Empty = new OccurrenceIamPolicyArgs();

    @InputImport(name="bindings")
    private final @Nullable Input<List<BindingArgs>> bindings;

    public Input<List<BindingArgs>> getBindings() {
        return this.bindings == null ? Input.empty() : this.bindings;
    }

    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="occurrenceId", required=true)
    private final Input<String> occurrenceId;

    public Input<String> getOccurrenceId() {
        return this.occurrenceId;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="version")
    private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public OccurrenceIamPolicyArgs(
        @Nullable Input<List<BindingArgs>> bindings,
        @Nullable Input<String> etag,
        Input<String> occurrenceId,
        @Nullable Input<String> project,
        @Nullable Input<Integer> version) {
        this.bindings = bindings;
        this.etag = etag;
        this.occurrenceId = Objects.requireNonNull(occurrenceId, "expected parameter 'occurrenceId' to be non-null");
        this.project = project;
        this.version = version;
    }

    private OccurrenceIamPolicyArgs() {
        this.bindings = Input.empty();
        this.etag = Input.empty();
        this.occurrenceId = Input.empty();
        this.project = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OccurrenceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<BindingArgs>> bindings;
        private @Nullable Input<String> etag;
        private Input<String> occurrenceId;
        private @Nullable Input<String> project;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(OccurrenceIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.occurrenceId = defaults.occurrenceId;
    	      this.project = defaults.project;
    	      this.version = defaults.version;
        }

        public Builder setBindings(@Nullable Input<List<BindingArgs>> bindings) {
            this.bindings = bindings;
            return this;
        }

        public Builder setBindings(@Nullable List<BindingArgs> bindings) {
            this.bindings = Input.ofNullable(bindings);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setOccurrenceId(Input<String> occurrenceId) {
            this.occurrenceId = Objects.requireNonNull(occurrenceId);
            return this;
        }

        public Builder setOccurrenceId(String occurrenceId) {
            this.occurrenceId = Input.of(Objects.requireNonNull(occurrenceId));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }

        public OccurrenceIamPolicyArgs build() {
            return new OccurrenceIamPolicyArgs(bindings, etag, occurrenceId, project, version);
        }
    }
}