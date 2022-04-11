// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.dns_v1.enums.ChangeStatus;
import io.pulumi.googlenative.dns_v1.inputs.ResourceRecordSetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChangeArgs Empty = new ChangeArgs();

    /**
     * Which ResourceRecordSets to add?
     * 
     */
    @Import(name="additions")
      private final @Nullable Output<List<ResourceRecordSetArgs>> additions;

    public Output<List<ResourceRecordSetArgs>> getAdditions() {
        return this.additions == null ? Codegen.empty() : this.additions;
    }

    @Import(name="clientOperationId")
      private final @Nullable Output<String> clientOperationId;

    public Output<String> getClientOperationId() {
        return this.clientOperationId == null ? Codegen.empty() : this.clientOperationId;
    }

    /**
     * Which ResourceRecordSets to remove? Must match existing data exactly.
     * 
     */
    @Import(name="deletions")
      private final @Nullable Output<List<ResourceRecordSetArgs>> deletions;

    public Output<List<ResourceRecordSetArgs>> getDeletions() {
        return this.deletions == null ? Codegen.empty() : this.deletions;
    }

    /**
     * Unique identifier for the resource; defined by the server (output only).
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * If the DNS queries for the zone will be served.
     * 
     */
    @Import(name="isServing")
      private final @Nullable Output<Boolean> isServing;

    public Output<Boolean> getIsServing() {
        return this.isServing == null ? Codegen.empty() : this.isServing;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    @Import(name="managedZone", required=true)
      private final Output<String> managedZone;

    public Output<String> getManagedZone() {
        return this.managedZone;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The time that this operation was started by the server (output only). This is in RFC3339 text format.
     * 
     */
    @Import(name="startTime")
      private final @Nullable Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime == null ? Codegen.empty() : this.startTime;
    }

    /**
     * Status of the operation (output only). A status of "done" means that the request to update the authoritative servers has been sent, but the servers might not be updated yet.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<ChangeStatus> status;

    public Output<ChangeStatus> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    public ChangeArgs(
        @Nullable Output<List<ResourceRecordSetArgs>> additions,
        @Nullable Output<String> clientOperationId,
        @Nullable Output<List<ResourceRecordSetArgs>> deletions,
        @Nullable Output<String> id,
        @Nullable Output<Boolean> isServing,
        @Nullable Output<String> kind,
        Output<String> managedZone,
        @Nullable Output<String> project,
        @Nullable Output<String> startTime,
        @Nullable Output<ChangeStatus> status) {
        this.additions = additions;
        this.clientOperationId = clientOperationId;
        this.deletions = deletions;
        this.id = id;
        this.isServing = isServing;
        this.kind = kind;
        this.managedZone = Objects.requireNonNull(managedZone, "expected parameter 'managedZone' to be non-null");
        this.project = project;
        this.startTime = startTime;
        this.status = status;
    }

    private ChangeArgs() {
        this.additions = Codegen.empty();
        this.clientOperationId = Codegen.empty();
        this.deletions = Codegen.empty();
        this.id = Codegen.empty();
        this.isServing = Codegen.empty();
        this.kind = Codegen.empty();
        this.managedZone = Codegen.empty();
        this.project = Codegen.empty();
        this.startTime = Codegen.empty();
        this.status = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ResourceRecordSetArgs>> additions;
        private @Nullable Output<String> clientOperationId;
        private @Nullable Output<List<ResourceRecordSetArgs>> deletions;
        private @Nullable Output<String> id;
        private @Nullable Output<Boolean> isServing;
        private @Nullable Output<String> kind;
        private Output<String> managedZone;
        private @Nullable Output<String> project;
        private @Nullable Output<String> startTime;
        private @Nullable Output<ChangeStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ChangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additions = defaults.additions;
    	      this.clientOperationId = defaults.clientOperationId;
    	      this.deletions = defaults.deletions;
    	      this.id = defaults.id;
    	      this.isServing = defaults.isServing;
    	      this.kind = defaults.kind;
    	      this.managedZone = defaults.managedZone;
    	      this.project = defaults.project;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder additions(@Nullable Output<List<ResourceRecordSetArgs>> additions) {
            this.additions = additions;
            return this;
        }
        public Builder additions(@Nullable List<ResourceRecordSetArgs> additions) {
            this.additions = Codegen.ofNullable(additions);
            return this;
        }
        public Builder additions(ResourceRecordSetArgs... additions) {
            return additions(List.of(additions));
        }
        public Builder clientOperationId(@Nullable Output<String> clientOperationId) {
            this.clientOperationId = clientOperationId;
            return this;
        }
        public Builder clientOperationId(@Nullable String clientOperationId) {
            this.clientOperationId = Codegen.ofNullable(clientOperationId);
            return this;
        }
        public Builder deletions(@Nullable Output<List<ResourceRecordSetArgs>> deletions) {
            this.deletions = deletions;
            return this;
        }
        public Builder deletions(@Nullable List<ResourceRecordSetArgs> deletions) {
            this.deletions = Codegen.ofNullable(deletions);
            return this;
        }
        public Builder deletions(ResourceRecordSetArgs... deletions) {
            return deletions(List.of(deletions));
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder isServing(@Nullable Output<Boolean> isServing) {
            this.isServing = isServing;
            return this;
        }
        public Builder isServing(@Nullable Boolean isServing) {
            this.isServing = Codegen.ofNullable(isServing);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder managedZone(Output<String> managedZone) {
            this.managedZone = Objects.requireNonNull(managedZone);
            return this;
        }
        public Builder managedZone(String managedZone) {
            this.managedZone = Output.of(Objects.requireNonNull(managedZone));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder startTime(@Nullable Output<String> startTime) {
            this.startTime = startTime;
            return this;
        }
        public Builder startTime(@Nullable String startTime) {
            this.startTime = Codegen.ofNullable(startTime);
            return this;
        }
        public Builder status(@Nullable Output<ChangeStatus> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable ChangeStatus status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }        public ChangeArgs build() {
            return new ChangeArgs(additions, clientOperationId, deletions, id, isServing, kind, managedZone, project, startTime, status);
        }
    }
}
