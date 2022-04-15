// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1;

import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GetNoteArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GetNoteIamPolicyArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GetOccurrenceArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GetOccurrenceIamPolicyArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.GetProviderNoteIamPolicyArgs;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GetNoteIamPolicyResult;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GetNoteResult;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GetOccurrenceIamPolicyResult;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GetOccurrenceResult;
import io.pulumi.googlenative.containeranalysis_v1alpha1.outputs.GetProviderNoteIamPolicyResult;
import java.util.concurrent.CompletableFuture;

public final class Containeranalysis_v1alpha1Functions {
    /**
     * Returns the requested `Note`.
     * 
     */
    public static CompletableFuture<GetNoteResult> getNote(GetNoteArgs args) {
        return getNote(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNoteResult> getNote(GetNoteArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:containeranalysis/v1alpha1:getNote", TypeShape.of(GetNoteResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a note or an `Occurrence` resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or occurrence, respectively. Attempting to call this method on a resource without the required permission will result in a `PERMISSION_DENIED` error. Attempting to call this method on a non-existent resource will result in a `NOT_FOUND` error if the user has list permission on the project, or a `PERMISSION_DENIED` error otherwise. The resource takes the following formats: `projects/{PROJECT_ID}/occurrences/{OCCURRENCE_ID}` for occurrences and projects/{PROJECT_ID}/notes/{NOTE_ID} for notes
     * 
     */
    public static CompletableFuture<GetNoteIamPolicyResult> getNoteIamPolicy(GetNoteIamPolicyArgs args) {
        return getNoteIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNoteIamPolicyResult> getNoteIamPolicy(GetNoteIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:containeranalysis/v1alpha1:getNoteIamPolicy", TypeShape.of(GetNoteIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the requested `Occurrence`.
     * 
     */
    public static CompletableFuture<GetOccurrenceResult> getOccurrence(GetOccurrenceArgs args) {
        return getOccurrence(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOccurrenceResult> getOccurrence(GetOccurrenceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:containeranalysis/v1alpha1:getOccurrence", TypeShape.of(GetOccurrenceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a note or an `Occurrence` resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or occurrence, respectively. Attempting to call this method on a resource without the required permission will result in a `PERMISSION_DENIED` error. Attempting to call this method on a non-existent resource will result in a `NOT_FOUND` error if the user has list permission on the project, or a `PERMISSION_DENIED` error otherwise. The resource takes the following formats: `projects/{PROJECT_ID}/occurrences/{OCCURRENCE_ID}` for occurrences and projects/{PROJECT_ID}/notes/{NOTE_ID} for notes
     * 
     */
    public static CompletableFuture<GetOccurrenceIamPolicyResult> getOccurrenceIamPolicy(GetOccurrenceIamPolicyArgs args) {
        return getOccurrenceIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetOccurrenceIamPolicyResult> getOccurrenceIamPolicy(GetOccurrenceIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:containeranalysis/v1alpha1:getOccurrenceIamPolicy", TypeShape.of(GetOccurrenceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a note or an `Occurrence` resource. Requires `containeranalysis.notes.setIamPolicy` or `containeranalysis.occurrences.setIamPolicy` permission if the resource is a note or occurrence, respectively. Attempting to call this method on a resource without the required permission will result in a `PERMISSION_DENIED` error. Attempting to call this method on a non-existent resource will result in a `NOT_FOUND` error if the user has list permission on the project, or a `PERMISSION_DENIED` error otherwise. The resource takes the following formats: `projects/{PROJECT_ID}/occurrences/{OCCURRENCE_ID}` for occurrences and projects/{PROJECT_ID}/notes/{NOTE_ID} for notes
     * 
     */
    public static CompletableFuture<GetProviderNoteIamPolicyResult> getProviderNoteIamPolicy(GetProviderNoteIamPolicyArgs args) {
        return getProviderNoteIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetProviderNoteIamPolicyResult> getProviderNoteIamPolicy(GetProviderNoteIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:containeranalysis/v1alpha1:getProviderNoteIamPolicy", TypeShape.of(GetProviderNoteIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}